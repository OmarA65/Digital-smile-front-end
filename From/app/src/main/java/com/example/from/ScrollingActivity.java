package com.example.from;

import android.app.DatePickerDialog;
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
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    private LinearLayout LL;
    private TextView DisplayDate;
    private DatePickerDialog datePicker;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        int selectedId = ((RadioGroup)findViewById(R.id.rg_sex)).getCheckedRadioButtonId();
        RadioButton genderButton = findViewById(selectedId);
        String gender = genderButton.getText().toString();

        selectedId = ((RadioGroup)findViewById(R.id.rg_occlusion)).getCheckedRadioButtonId();
        RadioButton occlusionButton = findViewById(selectedId);
        String occlusionType = occlusionButton.getText().toString();

        for(int i = 0; i < LL.getChildCount(); i++) {

            med_history.put((((CheckBox)LL.getChildAt(i)).getText()).toString(),
                    ((CheckBox)LL.getChildAt(i)).isChecked());

        }

        Log.d("hi bitch", occlusionType);
    }
}
