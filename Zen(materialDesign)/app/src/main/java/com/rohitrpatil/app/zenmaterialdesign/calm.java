package com.rohitrpatil.app.zenmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class calm extends AppCompatActivity implements View.OnClickListener {
    CardView nxtbtn,share;
    TextView quote,author;
    String shareBody;

    final String[] quotes ={
            "For there is no friend like a sister in calm or stormy weather; To cheer one on the tedious way, to fetch one if one goes astray, to lift one if one totters down, to strengthen whilst one stands.",
            "They sicken of the calm who know the storm.",
            "You are the sky. Everything else – it’s just the weather.",
            "Whoever's calm and sensible is insane!",
            "I like trains. I like their rhythm, and I like the freedom of being suspended between two places, all anxieties of purpose taken care of: for this moment I know where I am going.",
            "It's calm under the waves in the blue of my oblivion.",
            "Be like a duck, paddling and working very hard inside the water, but what everyone sees is a smiling and calm face.",
            "The only order in the universe is just a cycle of calm and chaos.",
            "The ideal of calm exists in a sitting cat.",
            "The storm before the calm.",
            "Who's crazy: people who trust other people, or people who don't?",
            "A samurai must remain calm at all times even in the face of danger.",
            "Gentleness is strength under control. It is the ability to stay calm, no matter what happens.",
            "When everything around you is crazy, it is ingenious to stay calm."
    };

    final String[] authors = {
            "RRP",
            "Dorothy Parker",
            "Pema Chödrön",
            "Jalaluddin Mevlana Rumi",
            "Anna Funder",
            "Fiona Apple",
            "Manoj Arora",
            "Toba Beta",
            "Jules Renard",
            "Cameron Conaway",
            "Lenore Skenazy","Chris Bradford",
            "Elizabeth George",
            "Mehmet Murat ildan",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calm);

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
        int rando = (int)(Math.random()*13);
        quote.setText(quotes[rando]);
        author.setText("-"+authors[rando]);
        shareBody = quotes[rando] + "-" + authors[rando] +", An app by RRP";
    }
}
