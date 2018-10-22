package com.colendi.narya.ethereumwallet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.colendi.narya.ethereumwallet.R.layout
import kotlinx.android.synthetic.main.activity_main.*
import org.kethereum.bip39.generateMnemonic
import org.kethereum.bip39.model.MnemonicWords
import org.kethereum.bip39.toKey
import org.kethereum.bip39.validate
import org.kethereum.bip39.wordlists.WORDLIST_ENGLISH

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        print("here")

        updateTextButton.setOnClickListener {
            val mnemonic = generateMnemonic(wordList = WORDLIST_ENGLISH)
            welcomeTextView.text = mnemonic
            Log.wtf("MainActivity", mnemonic)
            val validate = MnemonicWords(mnemonic).validate(WORDLIST_ENGLISH)
            Log.wtf("MainActivity", validate.toString())
            val tokey=MnemonicWords(mnemonic).toKey(path = "m/44")
            Log.wtf("MainActivity", tokey.toString())
        }
    }

}