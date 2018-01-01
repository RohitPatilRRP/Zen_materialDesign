package com.rohitrpatil.app.zenmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class idea extends AppCompatActivity implements View.OnClickListener {
    CardView nxtbtn,share;
    TextView quote,author;
    String shareBody;

    final String[] quotes = {
            "A clear vision, backed by definite plans, gives you a tremendous feeling of confidence and personal power.",
            "A man should never be appointed into a managerial position if his vision focuses on people’s weaknesses rather than on their strengths.",
            "All that we are is the result of what we have thought.",
            "Beware lest you lose the substance by grasping at the shadow.",
            "Do whatever you do intensely.",
            "I don’t care how much power, brilliance or energy you have, if you don’t harness it and focus it on a specific target, and hold it there you’re never going to accomplish as much as your ability warrants.",
            "Most people have no idea of the giant capacity we can immediately command when we focus all of our resources on mastering a single area of our lives.",
            "My success, part of it certainly, is that I have focused in on a few things.",
            "The successful warrior is the average man, with laser-like focus.",
            "You can’t depend on your eyes when your imagination is out of focus.",
            "90% of every art form is garbage – dance and stand-up, painting and music. Focus on the 10% that’s good, suck it up, and drive on.",
            "A business leader has to keep their organization focused on the mission. That sounds easy, but it can be tremendously challenging in today’s competitive and ever-changing business environment. A leader also has to motivate potential partners to join.",
            "A clear vision, backed by definite plans, gives you a tremendous feeling of confidence and personal power.",
            "A corporation is a living organism; it has to continue to shed its skin. Methods have to change. Focus has to change. Values have to change. The sum total of those changes is transformation.",
            "A major stimulant to creative thinking is focused questions. There is something about a well-worded question that often penetrates to the heart of the matter and triggers new ideas and insights.",
            "A man should never be appointed into a managerial position if his vision focuses on people’s weaknesses rather than on their strengths.",
            "A person who aims at nothing is sure to hit it.",
            "Act the part and you will become the part.",
            "All that we are is the result of what we have thought.",
            "Along with a strong belief in your own inner voice, you also need laser-like focus combined with unwavering determination.",
            "And I kind of said to myself if I get my voice back I’m not going to take back the old anxiety about it and just focus on the limitations. I’m really going to enjoy it.",
            "And so if your competitors aren’t growing, if there isn’t a competitive reason to grow, and you want focus and discipline to add customers to existing stores, you adjust your strategy.",
            "Any artist that’s involved in their work is inevitably going to have a focus in what they do.",
            "Are your thoughts worthy of you? If not – NOW is the time to change them. You can begin right were you are right now. Nothing matters but this moment and what you are focusing your attention on.",
            "As you become more clear about who you really are, you’ll be better able to decide what is best for you – the first time around.",
            "Be dramatically willing to focus on the customer at all costs, even at the cost of obsoleting your own stuff.",
            "Beware lest you lose the substance by grasping at the shadow.",
            "But when you’re beginning, you should try to focus on something you love and your own way of doing things.",
            "Concentrate all your thoughts upon the work at hand. The sun’s rays do not burn until brought to a focus.",
            "Concentrated attention is the collection of units of power on a chosen point of intention."
    };

    final String[] authors = {
            "Brian Tracy", "Peter Drucker", "Buddha", "Aesop", "Robert Henri", "Zig Ziglar", "Tony Robbins", "Bill Gates", "Bruce Lee", "Mark Twain",
            "Patton Oswalt", "Meg Whitman", "Brian Tracy", "Andrew Grove", "Brian Tracy", "Peter Drucker", "Anonymous", "William James", "Buddha", "Larry Flynt",
            "Rosanne Cash",
            "Jim Cantalupo",
            "Jock Sturges",
            "Rhonda Byrne",
            "Oprah Winfrey",
            "Scott Cook",
            "Aesop",
            "Jerry Harrison",
            "Alexander Graham Bell",
            "James Arthur Ray"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea);

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
        int rando = (int)(Math.random()*30);
        quote.setText(quotes[rando]);
        author.setText("-"+authors[rando]);
        shareBody = quotes[rando] + "-" + authors[rando] +", An app by RRP";
    }
}
