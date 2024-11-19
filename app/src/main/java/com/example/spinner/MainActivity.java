package com.example.spinner;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();






    }

    private void initView() {
        lV = (ListView) findViewById(R.id.lV);
        spin = (Spinner) findViewById(R.id.spin);
        tVLastName = (TextView) findViewById(R.id.tVLastName);
        tVName = (TextView) findViewById(R.id.tVName);
        tVBirthDate = (TextView) findViewById(R.id.tVBirthDate);
        tVNumber = (TextView) findViewById(R.id.tVNumber);
    }
}