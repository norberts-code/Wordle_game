package lv.rtu.dip701.wordle

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class game : AppCompatActivity() {
    val words = arrayOf<String>("death","apple","beach", "brain", "dance",  "grape", "happy", "toast", "water", "whale")
    val randomValue = Random.nextInt(0, 9)
    var counter : Int = 0
    var word : String = words[randomValue]
    lateinit var e11 : EditText
    lateinit var e12 : EditText
    lateinit var e13 : EditText
    lateinit var e14 : EditText
    lateinit var e15 : EditText
    lateinit var e21 : EditText
    lateinit var e22 : EditText
    lateinit var e23 : EditText
    lateinit var e24 : EditText
    lateinit var e25 : EditText
    lateinit var e31 : EditText
    lateinit var e32 : EditText
    lateinit var e33 : EditText
    lateinit var e34 : EditText
    lateinit var e35 : EditText
    lateinit var e41 : EditText
    lateinit var e42 : EditText
    lateinit var e43 : EditText
    lateinit var e44 : EditText
    lateinit var e45 : EditText
    lateinit var e51 : EditText
    lateinit var e52 : EditText
    lateinit var e53 : EditText
    lateinit var e54 : EditText
    lateinit var e55 : EditText
    fun returnScreen(view: View?){
        startActivity( Intent(this, MainActivity::class.java))
    }
    fun setup(e: EditText){
        e.setFocusable(false)
        e.setClickable(false);
    }
    fun focusChange(e1: EditText, e2: EditText){
        e1.setFocusable(false)
        e1.setClickable(false)
        e2.setFocusableInTouchMode(true)
        e2.setFocusable(true)
        e2.setClickable(true)
        e2.requestFocus()
    }
    fun compare(e1 : EditText, e2 : EditText, e3:EditText, e4 : EditText, e5 : EditText, word : String){
            for (y in 0..4) {
                if (word[y].toString().lowercase() == (e1.text).toString().lowercase()) {
                    e1.setBackgroundColor(Color.YELLOW)
                }
            }
            for (y in 0..4) {
                if (word[y].toString().lowercase() == (e2.text).toString().lowercase()) {
                    e2.setBackgroundColor(Color.YELLOW)
                }
            }
            for (y in 0..4) {
                if (word[y].toString().lowercase() == (e3.text).toString().lowercase()) {
                    e3.setBackgroundColor(Color.YELLOW)
                }
            }
            for (y in 0..4) {
                if (word[y].toString().lowercase() == (e4.text).toString().lowercase()) {
                    e4.setBackgroundColor(Color.YELLOW)
                }
            }
            for (y in 0..4) {
                if (word[y].toString().lowercase() == (e5.text).toString().lowercase()) {
                    e5.setBackgroundColor(Color.YELLOW)
                }
            }
            if (word[0].toString().lowercase() == ((e1).text).toString().lowercase()){
                e1.setBackgroundColor(Color.GREEN)
            }
            if (word[1].toString().lowercase() == ((e2).text).toString().lowercase()){
                e2.setBackgroundColor(Color.GREEN)
            }
            if (word[2].toString().lowercase() == ((e3).text).toString().lowercase()){
                e3.setBackgroundColor(Color.GREEN)
            }
            if (word[3].toString().lowercase() == ((e4).text).toString().lowercase()){
                e4.setBackgroundColor(Color.GREEN)
            }
            if (word[4].toString().lowercase() == ((e5).text).toString().lowercase()){
                e5.setBackgroundColor(Color.GREEN)
            }
    }
    fun gameWon(e1 : EditText, e2 : EditText, e3:EditText, e4 : EditText, e5 : EditText, word : String): Boolean {
        if (word[0].toString().lowercase() == ((e1).text).toString().lowercase() && word[1].toString().lowercase() == ((e2).text).toString().lowercase() && word[2].toString().lowercase() == ((e3).text).toString().lowercase() && word[3].toString().lowercase() == ((e4).text).toString().lowercase() && word[4].toString().lowercase() == ((e5).text).toString().lowercase()){
            e1.setBackgroundColor(Color.GREEN)
            e2.setBackgroundColor(Color.GREEN)
            e3.setBackgroundColor(Color.GREEN)
            e4.setBackgroundColor(Color.GREEN)
            e5.setBackgroundColor(Color.GREEN)
            return true
        }
        return false
    }
    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {

        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            counter += 1
            when(counter){
                1 -> {
                    focusChange(e11,e12)
                }
                2 -> {
                    focusChange(e12,e13)
                }
                3 -> {
                    focusChange(e13,e14)
                }
                4 -> {
                    focusChange(e14,e15)
                }
                5 -> {
                    if(gameWon(e11,e12,e13,e14,e15, word)){
                        setup(e15)
                    }
                    else{
                        focusChange(e15,e21)
                        compare(e11,e12,e13,e14,e15, word)
                    }
                }
                6 -> {
                    focusChange(e21,e22)
                }
                7 -> {
                    focusChange(e22,e23)
                }
                8 -> {
                    focusChange(e23,e24)
                }
                9 -> {
                    focusChange(e24,e25)
                }
                10 -> {
                    if(gameWon(e21,e22,e23,e24,e25, word)){
                        setup(e25)
                    }
                    else{
                        focusChange(e25,e31)
                        compare(e21,e22,e23,e24,e25, word)
                    }
                }
                11 -> {
                    focusChange(e31,e32)
                }
                12 -> {
                    focusChange(e32,e33)
                }
                13 -> {
                    focusChange(e33,e34)
                }
                14 -> {
                    focusChange(e34,e35)
                }
                15 -> {
                    if(gameWon(e31,e32,e33,e34,e35, word)){
                        setup(e35)
                    }
                    else{
                        focusChange(e35,e41)
                        compare(e31,e32,e33,e34,e35, word)
                    }
                }
                16 -> {
                    focusChange(e41,e42)
                }
                17 -> {
                    focusChange(e42,e43)
                }
                18 -> {
                    focusChange(e43,e44)
                }
                19 -> {
                    focusChange(e44,e45)
                }
                20 -> {
                    if(gameWon(e41,e42,e43,e44,e45, word)){
                        setup(e45)
                    }
                    else{
                        focusChange(e45,e51)
                        compare(e41,e42,e43,e44,e45, word)
                    }
                }
                21 -> {
                    focusChange(e51,e52)
                }
                22 -> {
                    focusChange(e52,e53)
                }
                23 -> {
                    focusChange(e53,e54)
                }
                24 -> {
                    focusChange(e54,e55)
                }
                25 -> {
                    if(gameWon(e51,e52,e53,e54,e55, word)){
                        setup(e55)
                    }
                    else{
                        setup(e55)
                        compare(e51,e52,e53,e54,e55, word)
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        e11 = this.findViewById(R.id.edit_11) as EditText
        e12 = this.findViewById(R.id.edit_12) as EditText
        setup(e12)
        e13 = this.findViewById(R.id.edit_13) as EditText
        setup(e13)
        e14 = this.findViewById(R.id.edit_14) as EditText
        setup(e14)
        e15 = this.findViewById(R.id.edit_15) as EditText
        setup(e15)
        e21 = this.findViewById(R.id.edit_21) as EditText
        setup(e21)
        e22 = this.findViewById(R.id.edit_22) as EditText
        setup(e22)
        e23 = this.findViewById(R.id.edit_23) as EditText
        setup(e23)
        e24 = this.findViewById(R.id.edit_24) as EditText
        setup(e24)
        e25 = this.findViewById(R.id.edit_25) as EditText
        setup(e25)
        e31 = this.findViewById(R.id.edit_31) as EditText
        setup(e31)
        e32 = this.findViewById(R.id.edit_32) as EditText
        setup(e32)
        e33 = this.findViewById(R.id.edit_33) as EditText
        setup(e33)
        e34 = this.findViewById(R.id.edit_34) as EditText
        setup(e34)
        e35 = this.findViewById(R.id.edit_35) as EditText
        setup(e35)
        e41 = this.findViewById(R.id.edit_41) as EditText
        setup(e41)
        e42 = this.findViewById(R.id.edit_42) as EditText
        setup(e42)
        e43 = this.findViewById(R.id.edit_43) as EditText
        setup(e43)
        e44 = this.findViewById(R.id.edit_44) as EditText
        setup(e44)
        e45 = this.findViewById(R.id.edit_45) as EditText
        setup(e45)
        e51 = this.findViewById(R.id.edit_51) as EditText
        setup(e51)
        e52 = this.findViewById(R.id.edit_52) as EditText
        setup(e52)
        e53 = this.findViewById(R.id.edit_53) as EditText
        setup(e53)
        e54 = this.findViewById(R.id.edit_54) as EditText
        setup(e54)
        e55 = this.findViewById(R.id.edit_55) as EditText
        setup(e55)
        e11.addTextChangedListener(textWatcher);
        e12.addTextChangedListener(textWatcher);
        e13.addTextChangedListener(textWatcher);
        e14.addTextChangedListener(textWatcher);
        e15.addTextChangedListener(textWatcher);
        e21.addTextChangedListener(textWatcher);
        e22.addTextChangedListener(textWatcher);
        e23.addTextChangedListener(textWatcher);
        e24.addTextChangedListener(textWatcher);
        e25.addTextChangedListener(textWatcher);
        e31.addTextChangedListener(textWatcher);
        e32.addTextChangedListener(textWatcher);
        e33.addTextChangedListener(textWatcher);
        e34.addTextChangedListener(textWatcher);
        e35.addTextChangedListener(textWatcher);
        e41.addTextChangedListener(textWatcher);
        e42.addTextChangedListener(textWatcher);
        e43.addTextChangedListener(textWatcher);
        e44.addTextChangedListener(textWatcher);
        e45.addTextChangedListener(textWatcher);
        e51.addTextChangedListener(textWatcher);
        e52.addTextChangedListener(textWatcher);
        e53.addTextChangedListener(textWatcher);
        e54.addTextChangedListener(textWatcher);
        e55.addTextChangedListener(textWatcher);
    }
}