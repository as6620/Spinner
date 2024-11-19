package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    ListView lV;
    Spinner spin;
    TextView tVLastName, tVName, tVBirthDate, tVNumber;
    String[] classNames = {"Class A", "Class B", "Class C", "Class D"};

    String[] classA_LastNames = {"Cohen", "Levi", "Mizrahi", "Peretz", "Biton", "Shimon", "Gabay", "Elbaz", "Avraham", "Katz"};
    String[] classA_FirstNames = {"David", "Sara", "Rachel", "Yossi", "Daniel", "Noa", "Maya", "Tomer", "Shira", "Omer"};
    String[] classA_BirthDates = {"01/01/2010", "15/03/2010", "22/06/2010", "09/09/2008", "12/12/2009", "05/04/2010", "11/11/2009", "17/07/2009", "06/02/2010", "30/08/2010"};
    String[] classA_PhoneNumbers = {"0525427673", "0541234567", "0527654321", "0521112233", "0529988776", "0544455667", "0523344556", "0542233445", "0526677889", "0525566778"};

    String[] classB_LastNames = {"Itzik", "Hila", "Ron", "Eden", "Eli", "Shai", "Alon", "Tali", "Dana", "Tom"};
    String[] classB_FirstNames = {"Mizrahi", "Golan", "Levi", "Ronen", "Dahan", "Bar", "Moyal", "Sharon", "Naim", "Ben"};
    String[] classB_BirthDates = {"02/02/2009", "18/05/2010", "22/03/2009", "10/10/2009", "05/05/2008", "19/06/2009", "12/07/2010", "20/04/2009", "08/11/2010", "25/12/2009"};
    String[] classB_PhoneNumbers = {"0529876543", "0541231234", "0529876543", "0521110000", "0529988776", "0543322110", "0525555555", "0527654321", "0546677889", "0525432109"};

    String[] classC_LastNames = {"Eran", "Tamar", "Noam", "Gal", "Ori", "Shir", "Ella", "Tal", "Yair", "Neta"};
    String[] classC_FirstNames = {"Ofer", "Sela", "Yaron", "Halevi", "Natan", "Lavi", "Yitzhak", "Carmi", "Gur", "Barkan"};
    String[] classC_BirthDates = {"12/02/2011", "01/09/2010", "16/05/2009", "21/08/2010", "18/03/2009", "10/12/2008", "04/07/2010", "11/04/2010", "15/11/2010", "09/06/2009"};
    String[] classC_PhoneNumbers = {"0528765432", "0543216547", "0524329876", "0524432211", "0521239876", "0549876543", "0528764321", "0522223333", "0525432111", "0545556667"};

    String[] classD_LastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson"};
    String[] classD_FirstNames = {"John", "Michael", "Sarah", "Emily", "James", "William", "David", "Jessica", "Daniel", "Samantha"};
    String[] classD_BirthDates = {"01/01/2010", "02/02/2009", "03/03/2010", "04/04/2008", "05/05/2009", "06/06/2010", "07/07/2008", "08/08/2009", "09/09/2009", "10/10/2009"};
    String[] classD_PhoneNumbers = {"0521234567", "0547654321", "0522345678", "0548765432", "0523456789", "0524567890", "0545678901", "0526789012", "0527890123", "0548901234"};

    String[] lastNames;
    String[] firstNames;
    String[] birthDates;
    String[] phoneNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        ArrayAdapter<String> adp = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, classNames);
        spin.setAdapter(adp);

        spin.setOnItemSelectedListener(this);

        lV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lV.setOnItemClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid) {
        if (pos == 0) {
            lastNames = classA_LastNames;
            firstNames = classA_FirstNames;
            birthDates = classA_BirthDates;
            phoneNumbers = classA_PhoneNumbers;
        }
        else if (pos == 1) {
            lastNames = classB_LastNames;
            firstNames = classB_FirstNames;
            birthDates = classB_BirthDates;
            phoneNumbers = classB_PhoneNumbers;
        }
        else if (pos == 2) {
            lastNames = classC_LastNames;
            firstNames = classC_FirstNames;
            birthDates = classC_BirthDates;
            phoneNumbers = classC_PhoneNumbers;
        }
        else {
            lastNames = classD_LastNames;
            firstNames = classD_FirstNames;
            birthDates = classD_BirthDates;
            phoneNumbers = classD_PhoneNumbers;
        }

        String[] students = new String[lastNames.length];
        for (int i = 0; i < lastNames.length; i++) {
            students[i] = firstNames[i] + " " + lastNames[i];
        }

        lV.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, students));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
        tVLastName.setText("Last Name: " + lastNames[pos]);
        tVName.setText("First Name: " + firstNames[pos]);
        tVBirthDate.setText("Birth Date: " + birthDates[pos]);
        tVNumber.setText("Phone: " + phoneNumbers[pos]);
    }

    private void initView() {
        lV = findViewById(R.id.lV);
        spin = findViewById(R.id.spin);
        tVLastName = findViewById(R.id.tVLastName);
        tVName = findViewById(R.id.tVName);
        tVBirthDate = findViewById(R.id.tVBirthDate);
        tVNumber = findViewById(R.id.tVNumber);
    }
}