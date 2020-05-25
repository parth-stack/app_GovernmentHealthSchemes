package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sample.data.*;

import java.io.File;
import java.util.ArrayList;

public class schemes extends AppCompatActivity {

    String staes_query="";
    String gender_query="";
    String age_query="";
    String disease_query="";
    SharedPreferences s;
    //////////////////////////
    String cache="";
    dbhelper helperObj;
    SQLiteDatabase db;
    //////////////////////////
    ArrayList<word> words=new ArrayList<word>();
    wordadapter itemsAdapter;
    //////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);

        s=getSharedPreferences("SchemesQuery",0);
        staes_query=s.getString("states","0");
        gender_query=s.getString("gender","0");
        age_query=s.getString("age_group","0");
        disease_query=s.getString("disease","0");
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        //db=openOrCreateDatabase(Environment.getExternalStorageDirectory().getAbsolutePath()+File.separator+"sample_db"+File.separator+"dummies.db", Context.MODE_PRIVATE,null);
        helperObj=new dbhelper(getApplicationContext());
        db=helperObj.getReadableDatabase();
        String[] projection={
                myContract.Entry.COLUMN_1_SCHEME_LINK,
                myContract.Entry.COLUMN_2_TITLE
        };

        TextView t=findViewById(R.id.textView8); ////////////////////////

        Cursor c=db.query(myContract.Entry.TABLE_NAME,projection,null,null,null,null,null);
        while(c.moveToNext()){
            for(int i=0;i<c.getColumnCount();i++){
                cache+=c.getString(i);
            }
            t.append(cache+".."+"\n");
            cache="";
        }
        c.close();
        db.close();


        */if(staes_query=="Andhra Pradesh"){
        words.add(new word("www.ysraarogyasri.ap.gov.in/","YSR Arogyasri Scheme"));
        words.add(new word("pmil.in/andhra-pradesh-govt-scheme/ysr-arogya-asara-scheme/","YSR Arogya Asara Scheme"));
        words.add(new word("drysrkv.ap.gov.in/","YSR Kanti Velugu Scheme"));
        words.add(new word("sspensions.ap.gov.in/","YSR pension kanuka scheme"));
        words.add(new word("apcmrf.ap.gov.in/","chief ministers Relief Fund"));
        words.add(new word("pradhanmantriyojana.co.in/ap-basavatarakam-mother-kits-scheme/","basavatakaram mother kite scheme"));
        words.add(new word("pradhanmantriyojana.co.in/bala-sanjeevani-scheme-andhra-pradesh-apply-free-food-nutrition/","bala sanjeevni scheme"));
        words.add(new word("sspensions.ap.gov.in/","transgenders pension scheme"));
        words.add(new word("healthmarketinnovations.org/program/arogya-raksha-yojana-health-micro-insurance","arogya raksha"));
        words.add(new word("www.thehindu.com/news/national/andhra-pradesh/%E2%80%98Swasthya-Vidya-Vahini%E2%80%99-launched/article16940042.ece","swasta vidya vahini"));
        itemsAdapter = new wordadapter(getApplicationContext(), words);
        ListView listView =findViewById(R.id.schemes);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://"+words.get(position).get_link()));
                startActivity(i);
            }
        });}
        if(staes_query=="Assam"){
            words.add(new word("https://dhubri.gov.in/schemes/detail/wage-compensation-scheme-for-pregnant-women-in-tea-garden-districts","Assam wage compensation scheme"));
            words.add(new word("http://www.mygovschemes.in/central-government/deen-dayal-divyangjan-sahajya-scheme-launched-in-assam-rs-5000-for-person-with-disabilities","Assam Deen  Dayal Divyajan scheme"));
            words.add(new word("https://www.gibl.in/government-scheme/atal-amrit-abhiyan.html","Atal Amrit Abhiyaan"));
            words.add(new word("http://safemedicinesindia.in/innerpage.php?title=Health%20ministry%20launches%20%27AMRIT%27%20Retail%20Pharmacy%20scheme","AMRIT"));
            words.add(new word("https://nhm.assam.gov.in/schemes/assam-arogya-nidhi","Assam Arogya Nidhi"));
            words.add(new word("https://nhm.assam.gov.in/schemes/chief-minister%E2%80%99s-free-diagnostic-services","CM free diagnostic service"));
            words.add(new word("https://www.operationsmile.org/","Operation Smile"));
            words.add(new word("https://nhm.assam.gov.in/schemes/sanjeevani-village-health-outreach-programme","Sanjivani "));
            itemsAdapter = new wordadapter(getApplicationContext(), words);
            ListView listView =findViewById(R.id.schemes);
            listView.setAdapter(itemsAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(words.get(position).get_link()));
                    startActivity(i);
                }
            });}
        if(staes_query=="Arunachal Pradesh"){
            words.add(new word("https://nenow.in/health/arunachal-state-mission-launched-to-accelerate-immunisation.html","Mission Pratiraksha"));
            words.add(new word("https://nenow.in/health/skoch-award-for-arunachals-cm-renal-replacement-society.html","Chief minister renal replacement"));
            words.add(new word("https://currentaffairs.gktoday.in/current-news/arunachal-pradesh-government-launches-dulari-kanya-scheme-check-infant-mortality","Dulari kanya"));
            itemsAdapter = new wordadapter(getApplicationContext(), words);
            ListView listView =findViewById(R.id.schemes);
            listView.setAdapter(itemsAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(words.get(position).get_link()));
                    startActivity(i);
                }
            });}
        if(staes_query=="Bihar"){
            words.add(new word("https://sarkariyojana.com/bihar-victim-compensation-scheme-2018-rape-acid-attack-victims/","Bihar victim compensation scheme"));
            words.add(new word("https://www.telegraphindia.com/states/bihar/help-at-hand-for-kala-azar/cid/295554","Mukhyamantri Kala azar rahat yojna"));
            words.add(new word("http://www.cmrf.bih.nic.in/users/home.aspx","CM medical assistance fund"));
            words.add(new word("https://www.iihmr.edu.in/student-dissertation/2011-2013/Knowledge-Attitude-of-Beneficiary-for-Utilization-of-Janani-Bal-Suraksha-Yojana","janani and baal suraksha yojna"));
            words.add(new word("https://hi.nhp.gov.in/%E0%A4%B0%E0%A4%BE%E0%A4%B7%E0%A5%8D%E0%A4%9F%E0%A5%8D%E0%A4%B0%E0%A5%80%E0%A4%AF-%E0%A4%95%E0%A5%81%E0%A4%B7%E0%A5%8D%E0%A4%A0-%E0%A4%B0%E0%A5%8B%E0%A4%97-%E0%A4%89%E0%A4%A8%E0%A5%8D%E0%A4%AE%E0%A5%82%E0%A4%B2%E0%A4%A8-%E0%A4%95%E0%A4%BE%E0%A4%B0%E0%A5%8D%E0%A4%AF%E0%A4%95%E0%A5%8D%E0%A4%B0%E0%A4%AE-(%E0%A4%8F%E0%A4%A8%E0%A4%8F%E0%A4%B2%E0%A4%88%E0%A4%AA%E0%A5%80)_pg","National Lyprosy "));
            itemsAdapter = new wordadapter(getApplicationContext(), words);
            ListView listView =findViewById(R.id.schemes);
            listView.setAdapter(itemsAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(words.get(position).get_link()));
                    startActivity(i);
                }
            });}

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        s.edit().remove("states").commit();
        s.edit().remove("gender").commit();
        s.edit().remove("age_group").commit();
        s.edit().remove("disease").commit();
    }
}
