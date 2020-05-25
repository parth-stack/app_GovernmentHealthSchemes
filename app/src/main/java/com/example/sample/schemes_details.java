package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Arrays;

public class schemes_details extends AppCompatActivity {
    Intent i;
    Button submit;
    Spinner state_spinner,age_spinner,gender_spinner,disease_spinner;
    String age_group[]={"0-14 years","15-24 years","25-54 years","55-64 years","65 above"};
    String states[]={"Andaman and Nicobar Islands",
            "Andhra Pradesh",
            "Assam",
            "Arunachal Pradesh",
            "Bihar",
            "Chandigarh",
            "Chhattisgarh",
            "Dadra and Nagar Haveli",
            "Daman and Diu",
            "Delhi",
            "Goa",
            "Gujarat",
            "Haryana",
            "Himachal Pradesh",
            "Jammu and Kashmir",
            "Jharkhand",
            "Karnataka",
            "Kerala",
            "Lakshadweep",
            "Madhya Pradesh",
            "Maharashtra",
            "Manipur",
            "Meghalaya",
            "Mizoram",
            "Nagaland",
            "Orissa",
            "Pondicherry",
            "Punjab",
            "Rajasthan",
            "Sikkim",
            "Tamil Nadu",
            "Telangana",
            "Tripura)",
            "Uttaranchal",
            "Uttar Pradesh",
            "West Bengal"};
    String gender[]={"MALE","FEMALE"};
    String disease[]={"All","Tuberculosis","HIV/AIDS","Cancer/Tumor","Heart","Maternity","Burn Injuries","Birth Defects/Deformities","Newborn","Diabetes",
            "Deficiencies","Leprosy","Polio/Immunization","Mental Health","Kidney","Vector Borne Diseases","Brain","Orthopediac","Urinary","Bone Marrow Transplant",
            "Clinical Test","Sanitary Pads Distribution","Lungs","Eyes Checkup","Plague","Disability","Accident Victims","Casual Diseases","Non-Communicable","Life Threatening",
            "Fertility Treatment","Joints Replacement","Plastic Surgery","Insurance Schemes"};
    SharedPreferences s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes_details);
        submit=findViewById(R.id.submit);
        state_spinner=findViewById(R.id.state_spinner);
        age_spinner=findViewById(R.id.age_spinner);
        gender_spinner=findViewById(R.id.gender_spinner);
        disease_spinner=findViewById(R.id.disease_spinner);
        ////////////////////////////////////////////////////////////////////////////
        s=getSharedPreferences("SchemesQuery",0);
        ////////////////////////////////////////////////////////////////////////////
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(getApplicationContext(),schemes.class);
                startActivity(i);
            }
        });

        final ArrayAdapter statesAdapter=new ArrayAdapter(this,R.layout.spinner_item, Arrays.asList(states));
        state_spinner.setAdapter(statesAdapter);
        state_spinner.setSelection(0,false);
        state_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                s.edit().putString("states",states[position]).commit();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        final ArrayAdapter genderAdapter=new ArrayAdapter(this,R.layout.spinner_item, Arrays.asList(gender));
        gender_spinner.setAdapter(genderAdapter);
        gender_spinner.setSelection(0,false);
        gender_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                s.edit().putString("gender",gender[position]).commit();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        final ArrayAdapter ageAdapter=new ArrayAdapter(this,R.layout.spinner_item, Arrays.asList(age_group));
        age_spinner.setAdapter(ageAdapter);
        age_spinner.setSelection(0,false);
        age_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                s.edit().putString("age_group",age_group[position]).commit();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        final ArrayAdapter diseaseAdapter=new ArrayAdapter(this,R.layout.spinner_item, Arrays.asList(disease));
        disease_spinner.setAdapter(diseaseAdapter);
        disease_spinner.setSelection(0,false);
        disease_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s.edit().putString("disease",disease[position]).commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}

