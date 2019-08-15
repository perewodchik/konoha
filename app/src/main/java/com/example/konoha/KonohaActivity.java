package com.example.konoha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import uk.co.deanwild.flowtextview.FlowTextView;
import uk.co.deanwild.flowtextview.listeners.OnLinkClickListener;

public class KonohaActivity extends AppCompatActivity {

    ArrayList<String> clans;
    Typeface narutoFont;
    TextView clanListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konoha);

        ArrayList<Clan> clans = new ArrayList<Clan>();
        clans.add(new Clan("Aburame Clan", "油女一族", R.drawable.aburame_clan));
        clans.add(new Clan("Akimichi Clan", "秋道一族", R.drawable.akimichi_clan));
        clans.add(new Clan("Hatake Clan", "はたけ一族", R.drawable.hatake_clan));
        clans.add(new Clan("Hōki Family", "ホウキ族"));
        clans.add(new Clan("Hyūga Clan", "日向一族", R.drawable.hyuga_clan));
        clans.add(new Clan("Inuzuka Clan", "犬塚一族", R.drawable.inuzuka_clan));
        clans.add(new Clan("Kohaku Clan", "琥珀一族", R.drawable.konaku_clan));
        clans.add(new Clan("Kurama Clan", "鞍馬一族", R.drawable.kurama_clan));
        clans.add(new Clan("Lee Clan", "リー一族"));
        clans.add(new Clan("Nara Clan", "奈良一族", R.drawable.nara_clan));
        clans.add(new Clan("Sarutobi Clan", "猿飛一族", R.drawable.sarutobi_clan));
        clans.add(new Clan("Senju Clan", "千手一族", R.drawable.senju_clan));
        clans.add(new Clan("Shimura Clan", "志村一族", R.drawable.shimura_clan));
        clans.add(new Clan("Uchiha Clan", "うちは一族", R.drawable.uchiha_clan));
        clans.add(new Clan("Uzumaki Clan", "うずまき一族", R.drawable.uzumaki_clan));
        clans.add(new Clan("Yamanaka Clan", "山中一族", R.drawable.yamanaka_clan));

        ClanAdapter clanAdapter = new ClanAdapter(this, clans);
        ListView listView = (ListView) findViewById(R.id.clanList);
        listView.setAdapter(clanAdapter);

        narutoFont = Typeface.createFromAsset(getAssets(), "fonts/njnaruto.ttf");
        clanListTextView = (TextView) findViewById(R.id.clanListTextView);
        clanListTextView.setTypeface(narutoFont);


        FlowTextView flowTextView = (FlowTextView) findViewById(R.id.flowTextView);
        Spanned html = Html.fromHtml("<html>" + getApplicationContext().getResources().getString(R.string.KonohagakureDescription) + "</html>");
        flowTextView.setText(html);
        flowTextView.setTextSize(32);

    }
}
