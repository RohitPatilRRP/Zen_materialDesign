package com.rohitrpatil.app.zenmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class love extends AppCompatActivity implements View.OnClickListener {
 CardView nxtbtn,share;
 TextView quote,authorTxt;
    String shareBody;

    final String[] lqoutes={"You can't blame gravity for falling in love.",
            "Love is but the discovery of ourselves in others, and the delight in the recognition.",
            "Tis better to have loved and lost than never to have loved at all.",
            "Love is when you meet someone who tells you something new about yourself.",
            "Love is friendship that has caught fire. It is quiet understanding, mutual confidence, sharing and forgiving. It is loyalty through good and bad times. It settles for less than perfection and makes allowances for human weaknesses.",
            "Love does not consist in gazing at each other, but in looking outward together in the same direction.",
            "Each moment of a happy lover's hour is worth an age of dull and common life.",
            "Love is composed of a single soul inhabiting two bodies.",
            "We can't command our love, but we can our actions",
            "The best thing to hold onto in life is each other.",
            "I was born with an enormous need for affection, and a terrible need to give it.",
            "Love is a force more formidable than any other. It is invisible - it cannot be seen or measured, yet it is powerful enough to transform you in a moment, and offer you more joy than any material possession could.",
            "Those who have never known the deep intimacy and the intense companionship of mutual love have missed the best thing that life has to give.",
            "Love has reasons which reason cannot understand.",
            "Love is like a friendship caught on fire. In the beginning a flame, very pretty, often hot and fierce, but still only light and flickering. As love grows older, our hearts mature and our love becomes as coals, deep-burning and unquenchable.",
            "You can search throughout the entire universe for someone who is more deserving of your love and affection than you are yourself, and that person is not to be found anywhere. You yourself, as much as anybody in the entire universe deserve your love and affection.",
            "Affection is responsible for nine-tenths of whatever solid and durable happiness there is in our lives.",
            "For small creatures such as we the vastness is bearable only through love.",
            "There is no surprise more magical than the surprise of being loved: It is God's finger on man's shoulder.",
            "Love and compassion are necessities, not luxuries. Without them humanity cannot survive.",
            "To love and be loved is to feel the sun from both sides.",
            "Faith makes all things possible... love makes all things easy.",
            "We loved with a love that was more than love.",
            "The degree of loving is measured by the degree of giving.",
            "If thou must love me, let it be for naught except for love's sake only.",
            "Immature love says: 'I love you because I need you.' Mature love says 'I need you because I love you.'",
            "Love is the only sane and satisfactory answer to the problem of human existence.",
            "Love is a game that two can play and both win.",
            "The most powerful weapon on earth is the human soul on fire.",
            "Lord, grant that I might not so much seek to be loved as to love.",
            "True love is like ghosts, which everyone talks about and few have seen.",
            "Love is a smoke made with the fume of sighs."
    };

    final String[] author={"Albert Einstein",
            "Alexander Smith","Alfred Lord Tennyson",
            "Andre Breton","Ann Landers",
            "Antoine de Saint-Exupery","Aphra Behn",
            "Aristotle","Arthur Conan Doyle",
            "Audrey Hepburn","Audrey Hepburn",
            "Barbara de Angelis","Bertrand Russell",
            "Bertrand Russell","Blaise Pascal",
            "Bruce Lee","Buddha",
            "C. S. Lewis","Carl Sagan",
            "Charles Morgan","Dalai Lama",
            "David Viscott","Dwight L. Moody",
            "Edgar Allan Poe","Edwin Louis Cole",
            "Elizabeth Barrett Browning","Erich Fromm",
            "Erich Fromm","Eva Gabor","Ferdinand Foch",
            "Francis of Assisi","Francois de La Rochefoucauld","William Shakespeare"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        quote= (TextView)findViewById(R.id.quote);
        authorTxt= (TextView)findViewById(R.id.author);
        nxtbtn=(CardView)findViewById(R.id.nxtbtn);
        share=(CardView)findViewById(R.id.share);

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
        int rando = (int)(Math.random()*31);
        quote.setText(lqoutes[rando]);
        authorTxt.setText("-"+author[rando]);
        shareBody = lqoutes[rando] + "-" + author[rando] +" ,An app by RRP";
    }
}
