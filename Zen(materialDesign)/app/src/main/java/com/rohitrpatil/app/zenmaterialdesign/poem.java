package com.rohitrpatil.app.zenmaterialdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class poem extends AppCompatActivity implements View.OnClickListener {

    TextView poemTxt;CardView nxtbtn;

    final String[] poems = {
            "There was a girl who was afraid of love, \n" +
                    "Who always denied for every commitment, \n" +
                    "Peace in life just like a dove,\n" +
                    "Lived for dance and excitement.\n" +
                    "\n" +
                    "She had a bestie who cared a lot, \n" +
                    "And who also pretended who have same perceptions,\n" +
                    "Slowly and gradually like from a magical pot,\n" +
                    "They started to develop feelings and emotions.\n" +
                    "\n" +
                    "Had not the boy confessed first, \n" +
                    "The girl wouldn't have realised,\n" +
                    "And then she began this journey based on trust,\n" +
                    "As her dreams had become materialised.\n" +
                    "\n" +
                    "Those lovely days, when they became the world of another,\n" +
                    "And no single day went without talking, crazy imaginations started to bother, \n" +
                    "Hand in hand they started walking.\n" +
                    "\n" +
                    "When their hearts were set on fire\n" +
                    "and beautiful memories were created\n" +
                    "Not sharing him was her only desire\n" +
                    "Strong bond of love and connection had been established.\n" +
                    "\n" +
                    "The tapping of his hand when head used to be on his shoulder,\n" +
                    "Eyes spoke words when came in contact\n" +
                    "Joy and happiness was all over.\n" +
                    "\n" +
                    "But destiny had some other plans\n" +
                    "And the girl was unaware\n" +
                    "That her Prince would make her life a mess\n" +
                    "Things revealed that were undeclared.\n" +
                    "\n" +
                    "She experienced the real heart pain \n" +
                    "As she was just a second freaking choice\n" +
                    "And there was nothing left to gain\n" +
                    "She decided to leave following her heart's desire.\n" +
                    "\n" +
                    "Tears rolled down her eyes\n" +
                    "As it was a big setback\n" +
                    "She decided to break the ice\n" +
                    "And tried to remain strong in this emotional attack.\n" +
                    "\n" +
                    "Nights had become sleepless\n" +
                    "And she couldn't figure out why this happened\n" +
                    "Move which he took was so senseless\n" +
                    "That thousand tries will never get things fixed. \n" +
                    "\n" +
                    "She suffered Inspite of no mistake\n" +
                    "And every moment kept becoming worse\n" +
                    "As she missed him and was not a fake\n" +
                    "But he wasn't worth endorse.\n" +
                    "\n" +
                    "Yes that girl hates love again\n" +
                    "And will surely move on one day\n" +
                    "She was lucky as her friends helped her regain\n" +
                    "But in this the boy lost a jewel, for which he should regret every coming day",

                    "They used to fight every single day \uD83D\uDE45\uD83C\uDFFB\uD83D\uDE45\uD83C\uDFFB\u200D♂\n" +
                    "Unknown of the fact that was taking place \n" +
                    "Somewhere in their hearts there was a spark \uD83D\uDC9D✨\n" +
                    "Not of anger, but  overpowered by love mark ❣\n" +
                    "\n" +
                    "Feelings were to be confessed, \n" +
                    "But they were both confused \uD83E\uDD14\n" +
                    "As to how to speak their hearts out \n" +
                    "Because it was all really true☺\n" +
                    "\n" +
                    "When words mixed with emotions \n" +
                    "Started to roll over \n" +
                    "They decorated a special heart corner ❤\n" +
                    "And accepted each other. \uD83D\uDC91\uD83D\uDC6B\n" +
                    "\n" +
                    "They were not like the usual ones \n" +
                    "And still fumbled with expressions \n" +
                    "Removed the thorns that would hurt\n" +
                    "And filled their lives with creations. \uD83D\uDE0D\n" +
                    "\n" +
                    "Their relation is very precious and rare \uD83D\uDC8E\n" +
                    "Depicting internal beauty, freshness and glare ✨\uD83D\uDCAB\n" +
                    "In this world full of roller coaster rides \uD83C\uDFA2\n" +
                    "They will always be side by side.\uD83D\uDC6B",

                    "When the sun shines bright \n" +
                    "But the light cannot enter your life \n" +
                    "When the very known faces reveal \n" +
                    "And your heart seems to get cut by a knife\n" +
                    "\n" +
                    "When your eyes actually open\n" +
                    "And you, all of a sudden realise \n" +
                    "That very few of them wear a blanket of truth \n" +
                    "Accept it and with a new beginning initialise \n" +
                    "\n" +
                    "The time has come when meanings change \n" +
                    "Distance no longer means the same \n" +
                    "Strong bond can be established only then \n" +
                    "When no is fake and justifies God's real fame.",

                    "The inner voice\n" +
                    "\n" +
                    "Which had no choice\n" +
                    "\n" +
                    "Was just as numb as it could be\n" +
                    "\n" +
                    "It was entitled to shine\n" +
                    "\n" +
                    "But was submerged in a wine\n" +
                    "Longing for peace and life's treasury.\n" +
                    "Ruthlessly when it's objectified\n" +
                    "\n" +
                    "And there is no means left to justify\n" +
                    "It designates to roll over\n" +
                    "\n" +
                    "But somewhere in the dark\n" +
                    "\n" +
                    "And you decide to ignite a spark\n" +
                    "\n" +
                    "The pernicious memories cross-over.\n" +
                    "With the advent of euphemism\n" +
                    "\n" +
                    "And mind being set free of it's naxalism\n" +
                    "A brighter future awaits\n" +
                    "\n" +
                    "Acclimatize and greatly extol\n" +
                    "\n" +
                    "Candor but don't be brusque to troll\n" +
                    "Embellish and remove all constraints.",

            "When I was a toddler\n" +
                    "\n" +
                    "and I don't know how to fool\n" +
                    "\n" +
                    "My mom took my shoes to a cobbler\n" +
                    "\n" +
                    "and sent me off to school'.\n" +
                    "\n" +
                    "In initial days when I used to cry\n" +
                    "\n" +
                    "and no new cake or chocolate could Justify\n" +
                    "\n" +
                    "My parents had asked me to give it a try\n" +
                    "\n" +
                    "Next what happened is beyond to specify.\n" +
                    "Books hab started piling up in stock\n" +
                    "\n" +
                    "manners and values were all efficiently taught\n" +
                    "friends during breaks were all set to rock\n" +
                    "happiness and joy is what school brought\n" +
                    "lessons which I learned\n" +
                    "will help me bearing distress\n" +
                    "\n" +
                    "these remarkable memories can't be burned\n" +
                    "\n" +
                    "and I'll lead myself the path of success"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        nxtbtn=(CardView)findViewById(R.id.nxtbtn);
        poemTxt = (TextView)findViewById(R.id.poemTxt);
        nxtbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int rando = (int)(Math.random()*5);
        poemTxt.setText(poems[rando]);
    }
}
