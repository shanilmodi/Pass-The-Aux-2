package com.shanilmodigmail.musicapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    int count = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<Quote> quoteList = new ArrayList<Quote>();

        Quote quote4 = new Quote("You're more of a fun vampire. You don't suck blood, you just suck.", "Troy Barnes");
        quoteList.add(quote4);

        Quote quote1 = new Quote("Cool Beans", "Rod Kimble");
        quoteList.add(quote1);

        Quote quote2 = new Quote("How can mirrors be real if our eyes aren't real", "Jaden Smith");
        quoteList.add(quote2);

        Quote quote3 = new Quote("That's like me blaming owls for how bad I suck at analogies.", "Britta Perry");
        quoteList.add(quote3);

        Quote quote5 = new Quote("I was gonna be the first person in my family to graduate from community college. Everyone else graduated from normal college", "Troy Barnes");
        quoteList.add(quote5);

        //Add more quotes here


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < quoteList.size()) {

                    Quote q = quoteList.get(count);

                    quoteText.setText(q.getQuote());

                    personText.setText(q.getPerson());

                    count = count + 1;


                } else {

                    count = 0;

                }


            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "HomePage Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.shanilmodigmail.musicapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "HomePage Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.shanilmodigmail.musicapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
