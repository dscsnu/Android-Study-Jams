package com.jam.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var noOne = findViewById<Button>(R.id.button1)
//      Declare variables for button2, button3, button4,
//      button5, button6, button7, button8, button9, button0,
//      buttonplus, buttonequal, backspace, clear, results
//      after creating the layout as given in the question statement.


//      Note: disply is the variable for output TextView
        noOne.setOnClickListener{disply.append("1")}
//      SetOnClickListener for other buttons to append
//      that respective number and symbols

//      Set the functions to the buttons buttonequal,
//      backspace and clear.
//      Note: These takes TextView as arguments
//      Eg:
//      <Button variable>.setOnClickListener{<function>(<output textView variable>)}

    }
//  Understand how these functions work and assign these
//  functions to respective buttons
    fun evaluate(eq:TextView){
        var result =0
        for(i in eq.text.split("+")){
            result+=i.toInt()
        }
        eq.text = result.toString()

    }
    fun backspace(textBox:TextView){
        textBox.text = textBox.text.substring(0,textBox.text.length-1)
    }
    fun clearall(textBox:TextView){
        textBox.text=""
    }
}