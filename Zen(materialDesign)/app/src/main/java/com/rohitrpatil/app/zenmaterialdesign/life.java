package com.rohitrpatil.app.zenmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class life extends AppCompatActivity implements View.OnClickListener{
    CardView nxtbtn,share;
    TextView quote,author;
    String shareBody;

    final String[] quotes = {"Don't cry because it's over, smile because it happened.",
        "I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.",
           "You've gotta dance like there's nobody watching Love like you'll never be hurt, Sing like there's nobody listening And live like it's heaven on earth.",
            "You only live once, but if you do it right, once is enoug",
            "In three words I can sum up everything I've learned about life: it goes on",
            "To live is the rarest thing in the world. Most people exist, that is all.",
            "Insanity is doing the same thing, over and over again, but expecting different results.",
            "It is better to be hated for what you are than to be loved for what you are not.",
            "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.",
            "It does not do to dwell on dreams and forget to live.",
            "Good friends, good books, and a sleepy conscience: this is the ideal life.",
            "Life is what happens to us while we are making other plans.",
            "I may not have gone where I intended to go, but I think I have ended up where I needed to be.",
            "Everything you can imagine is real.",
            "Sometimes the questions are complicated and the answers are simple.",
            "Today you are You, that is truer than true. There is no one alive who is Youer than You.",
            "I'm not afraid of death; I just don't want to be there when it happens.",
            "Life isn't about finding yourself. Life is about creating yourself.",
            "Some infinities are bigger than other infinities.",
            "Life is like riding a bicycle. To keep your balance, you must keep moving.",
            "Reality continues to ruin my life.",
            "Things change. And friends leave. Life doesn't stop for anybody.",
            "The only way out of the labyrinth of suffering is to forgive.",
            "When someone loves you, the way they talk about you is different. You feel safe and comfortable.",
            "I'm the one that's got to die when it's time for me to die, so let me live my life the way I want to.",
            "But better to get hurt by the truth than comforted with a lie.",
            "Just when you think it can't get any worse, it can. And just when you think it can't get any better, it can.",
            "We are what we pretend to be, so we must be careful about what we pretend to be.",
            "The fear of death follows from the fear of life. A man who lives fully is prepared to die at any time.",
            "The one you love and the one who loves you are never, ever the same person.",
            "I speak to everyone in the same way, whether he is the garbage man or the president of the university.",
            "How wonderful it is that nobody need wait a single moment before starting to improve the world.",
            "We're all human, aren't we? Every human life is worth the same, and worth saving.",
            "If you don't know where you're going, any road'll take you there",
            "The saddest aspect of life right now is that science gathers knowledge faster than society gathers wisdom.",
            "All God does is watch us and kill us when we get boring. We must never, ever be boring.",
    };

    final String[] authors={"Dr. Seuss",
            "Marilyn Monroe",
            "William W. Purkey",
            "Mae West",
            "Robert Frost",
            "Oscar Wilde","Narcotics Anonymous",
            "André Gide, Autumn Leaves",
            "Albert Einstein",
            "J.K. Rowling",
            "Mark Twain",
            "Allen Saunders",
            "Douglas Adams",
            "Pablo Picasso",
            "Dr. Seuss",
            "Dr. Seuss",
            "Woody Allen",
            "George Bernard Shaw",
            "John Green",
            "Albert Einstein",
            "Bill Watterson",
            "Stephen Chbosky","John Green","Jess C. Scott","J.K. Rowling",
            "Ralph Waldo Emerson","Jimi Hendrix","Khaled Hosseini",
            "Nicholas Sparks","Kurt Vonnegut Jr.",
            "Mark Twain","Chuck Palahniuk",
            "Albert Einstein","Anne Frank","J.K. Rowling","George Harrison",
            "Isaac Asimov","Chuck Palahniuk"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        nxtbtn=(CardView)findViewById(R.id.nxtbtn);
        share=(CardView)findViewById(R.id.share);
        quote=(TextView)findViewById(R.id.quote);
        author=(TextView)findViewById(R.id.author);

        nxtbtn.setOnClickListener(this);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent share = new Intent(Intent.ACTION_SEND);
                    share.setType("text/plain");
                    share.putExtra(Intent.EXTRA_SUBJECT, "App By RRP");
                    share.putExtra(Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(share, "Share Via"));
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No quote available",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        int rando = (int)(Math.random()*35);
        quote.setText(quotes[rando]);
        author.setText("-"+authors[rando]);
        shareBody = quotes[rando] + "-" + authors[rando] +", An app by RRP";
    }
}
