package com.example.from;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;

import androidx.cardview.widget.CardView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class ScrollingActivity extends AppCompatActivity {
    private HashMap<String, Boolean> med_history = new HashMap();
    private HashMap<String, Boolean> sounds = new HashMap();
    private LinearLayout LL, soundsLL;
    private TextView DisplayDate;
    private DatePickerDialog datePicker;
    private String date;
    private String biteType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Spinner biteTypeSpinner = (Spinner)findViewById(R.id.type_of_bite);

        ArrayAdapter myAdapter = new ArrayAdapter<String>(ScrollingActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Bitetype)){
            @Override
            public boolean isEnabled(int position){

                if(position == 0)
                {

                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        biteTypeSpinner.setAdapter(myAdapter);

        biteTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                biteType = (String) parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        LL = findViewById(R.id.med_history_checkboxes);

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        datePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                date = dayOfMonth + "/" + month + "/" + year;

            }
        }, year , month , dayOfMonth);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void submitInfo(View view) {
        EditText name = findViewById(R.id.et_name);
        EditText telephone = findViewById(R.id.et_telephone);
        EditText address = findViewById(R.id.et_address);
        EditText occupation = findViewById(R.id.et_occupation);

        EditText surgeriesPast5Years = findViewById(R.id.et_surgeries);
        EditText complaintPatientWords  = findViewById(R.id.et_complaint);
        EditText medLineDevOpening = findViewById(R.id.et_deviation);
        EditText mouthOpening = findViewById(R.id.et_mouth_opening);
        EditText symmetryOfTheFace = findViewById(R.id.et_symmetry);
        EditText lateralMandibularMove = findViewById(R.id.et_lateral_man);
        EditText musclesOfMastication = findViewById(R.id.et_muscles_of_mastication);
        EditText lymphNodes = findViewById(R.id.et_lymph_nodes);

        EditText toothLossCauses = findViewById(R.id.et_tooth_loss);
        EditText mucosaInEdentulousArea = findViewById(R.id.et_mucosa);
        EditText tongue = findViewById(R.id.et_tongue);
        EditText badHabits = findViewById(R.id.et_bad_habits);
        EditText oralHygiene = findViewById(R.id.et_oral_hygiene);

        EditText extraOralXrays = findViewById(R.id.et_extraoral_rays);
        EditText intraOralXrays = findViewById(R.id.et_intraoral_rays);

        EditText fullTreatmentPlane = findViewById(R.id.et_full_treatment);
        EditText upperRightQuadrant = findViewById(R.id.et_upper_right_q);
        EditText upperLeftQuadrant = findViewById(R.id.et_upper_left_q);
        EditText lowerRightQuadrant = findViewById(R.id.et_lower_right_q);
        EditText lowerLeftQuadrant = findViewById(R.id.et_lower_left_q);




        int selectedId = ((RadioGroup)findViewById(R.id.rg_sex)).getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(selectedId);
        String gender = genderButton.getText().toString();

        selectedId = ((RadioGroup)findViewById(R.id.rg_occlusion)).getCheckedRadioButtonId();
        RadioButton occlusionButton = findViewById(selectedId);
        String occlusionType = occlusionButton.getText().toString();

        selectedId = ((RadioGroup)findViewById(R.id.rg_lip_line)).getCheckedRadioButtonId();
        RadioButton lipLineButton = findViewById(selectedId);
        String lipLineType = occlusionButton.getText().toString();

        for(int i = 0; i < LL.getChildCount(); i++) {

            med_history.put((((CheckBox)LL.getChildAt(i)).getText()).toString(),
                    ((CheckBox)LL.getChildAt(i)).isChecked());

        }

        for(int i = 0; i < soundsLL.getChildCount(); i++) {

            sounds.put((((CheckBox)soundsLL.getChildAt(i)).getText()).toString(),
                    ((CheckBox)soundsLL.getChildAt(i)).isChecked());

        }

        Patient patient = new Patient(name.toString(),occupation.toString(),address.toString(),telephone.toString(),gender,date,
                occlusionType,biteType,lipLineType,surgeriesPast5Years.toString(),complaintPatientWords.toString(),medLineDevOpening.toString(),mouthOpening.toString()
                ,symmetryOfTheFace.toString(),lateralMandibularMove.toString(),musclesOfMastication.toString(),lymphNodes.toString(),toothLossCauses.toString(),
                mucosaInEdentulousArea.toString(),tongue.toString(),badHabits.toString(),oralHygiene.toString(),extraOralXrays.toString(),intraOralXrays.toString(),
                fullTreatmentPlane.toString(),upperRightQuadrant.toString(),upperLeftQuadrant.toString(), lowerRightQuadrant.toString(), lowerLeftQuadrant.toString(),
                med_history,sounds);

    }
}
