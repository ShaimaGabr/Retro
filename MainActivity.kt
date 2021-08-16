package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
   // lateinit var recyclerView: RecyclerView
    //lateinit var madapter:CustomAdapter
    lateinit var edit1:EditText
    lateinit var edit2:EditText
    lateinit var edit3:EditText
    lateinit var  button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit1=findViewById(R.id.edit1)
        edit2=findViewById(R.id.edit2)
        edit3=findViewById(R.id.edit3)
        button=findViewById(R.id.button)
        //recyclerView=findViewById(R.id.recycler)
      //  https://newsapi.org/v2/everything?q=tesla&from=2021-02-21&sortBy=publishedAt&apiKey=fffb7e3e97484c7b8aa316bdee2e506c
        button.setOnClickListener {
            Connection.Retrofit_connection().registerpost(edit1.text.toString(), edit2.text.toString(), edit3.text.toString()).enqueue(object : Callback<RegisterModel> {
                override fun onFailure(call: Call<RegisterModel>, t: Throwable) {
                    Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<RegisterModel>, response: Response<RegisterModel>) {
                    Toast.makeText(applicationContext, response.body()!!.response, Toast.LENGTH_SHORT).show()
                }

            })
        } }
}