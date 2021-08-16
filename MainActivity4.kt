package com.example.retrofit

import android.graphics.fonts.Font
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.Toast
import br.com.joinersa.oooalertdialog.OoOAlertDialog
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog
import com.gdacciaro.iOSDialog.iOSDialogBuilder
//import ir.androidexception.andexalertdialog.AndExAlertDialog

class MainActivity4 : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button=findViewById(R.id.button)
        button.setOnClickListener {
//            iOSDialogBuilder(this@MainActivity4)
//                .setTitle(getString(R.string.dialogTitle))
//                .setSubtitle(getString(R.string.dialogMessage))
//                .setBoldPositiveLabel(true)
//                .setCancelable(false)
//                .setPositiveListener(
//                    getString(android.R.string.ok)
//                ) { dialog ->
//                    //Toast.makeText(this@MainActivity4, "Clicked!", Toast.LENGTH_LONG).show()
//
//                    dialog.dismiss()
//                }
//
//                .setNegativeListener(
//                    getString(android.R.string.cancel)
//                ) { dialog -> dialog.dismiss() }
//                .build().show()
//            TTFancyGifDialog.Builder(this@MainActivity4)
//                .setTitle("Online Shopping")
//                .setMessage("You don't have time for shopping, Visit our website for online shopping with discount price.")
//                .setPositiveBtnText("Ok")
//                .setPositiveBtnBackground("#c1272d")
//                .setGifResource(R.drawable.itgate2) //pass your gif, png or jpg
//
//                .isCancellable(true)
//                .OnPositiveClicked {
                   // Toast.makeText(this@MainActivity4, "Ok", Toast.LENGTH_SHORT).show()
//                    TTFancyGifDialog.Builder(this@MainActivity4)
//                        .setTitle("Online Shopping")
//                        .setMessage("You don't have time for shopping, Visit our website for online shopping with discount price.")
//                        .setPositiveBtnText("no")
//                        .setPositiveBtnBackground("#c1272d")
//                        .setGifResource(R.drawable.ic_username_24) //pass your gif, png or jpg
//
//                        .isCancellable(true)
//                        .OnPositiveClicked {
//                            // Toast.makeText(this@MainActivity4, "Ok", Toast.LENGTH_SHORT).show()
//                        }
//
//                        .build()
//                }
//
//                .build()
//             AndExAlertDialog.Builder(this)
//                .setTitle("hello")
//                .setMessage("welcom")
//                .setPositiveBtnText("yes")
//                .setNegativeBtnText("no")
//                .setCancelableOnTouchOutside(true)
//               // .setFont()
//               // .setImage(image, imagePercent)
//                //.setEditText(true, false, hintText, InputType.TEXT_MULTI_LINE)
//                .OnPositiveClicked()
//                { Toast.makeText(this,"no",Toast.LENGTH_SHORT).show()}
//
//                .OnNegativeClicked()
//                { Toast.makeText(this,"yes",Toast.LENGTH_SHORT).show()}
//                .setTitleTextColor(R.color.blue_btn_bg_color)
//                .setMessageTextColor(R.color.blue_btn_bg_color)
//                .setButtonTextColor(R.color.blue_btn_bg_color)
            OoOAlertDialog.Builder(this@MainActivity4)
              .setTitle("ITGate")
       //     .setMessage("Deseja fechar este OoOAlertDialog?")
               .setImage(R.drawable.itgate2)
                //setAnimation(Animation.AB
                .setPositiveButton("Fechar"){Toast.makeText(this,"",Toast.LENGTH_SHORT).show()}
              .setNegativeButton("Mensagem", null
              )
                .build()
        }


        }


}