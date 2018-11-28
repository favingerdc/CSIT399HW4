package e.devin.csit399hw4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val EMPID= "empid"
const val EMPNAME= "empName"
const val EMPSALARY= "empSalary"
const val EMPPHONE= "empPhone"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_button.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(EMPID, emp_id.text.toString())
            intent.putExtra(EMPNAME, emp_name.text.toString())
            intent.putExtra(EMPSALARY, emp_salary.text.toString())
            intent.putExtra(EMPPHONE, emp_phone.text.toString())
            startActivity(intent)

        }
    }
}
