package e.devin.csit399hw4

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_details)
        emp_id_value.setText("EMP ID: " +intent.getStringExtra(EMPID))
        emp_name_value.setText("EMP Name: " +intent.getStringExtra(EMPNAME))
        emp_salary_value.setText("EMP Salary: " +intent.getStringExtra(EMPSALARY))
        emp_phone_value.setText("EMP Phone: " +intent.getStringExtra(EMPPHONE))



    }
}