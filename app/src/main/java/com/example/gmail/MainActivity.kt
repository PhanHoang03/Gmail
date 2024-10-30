package com.example.gmail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.adapters.EmailAdapter
import com.example.gmail.models.Email
import java.util.ArrayList;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dữ liệu giả cho danh sách email
        val emailList = listOf(
            Email("ExchangeRate-API", "Account Activated", "Thanks for confirming your email address, ...", "05:46 PM", R.drawable.ic_email1),
            Email("Steam", "The Battle of Polytopia is now on sale!", "Steam 1 GAME YOU’VE WISHED FOR IS ON SALE!...", "11:22 AM", R.drawable.ic_email1),
            Email("Quora Digest", "What do KFC stores do with leftover chicken?",
                    "We pulled into a Popeyes Chicken at the...", "Oct 29", R.drawable.ic_email1),
            Email("MongoDB", "Build your application quickly", "Simplify development with CRUD operations...", "Oct 29", R.drawable.ic_email1),
            Email("itch.io", "Penusbmic released a new asset pack", "STRANDED - Animal Pack 1!", "Oct 29", R.drawable.ic_email1),
            Email("Codeforces", "Educational Codeforces Round 171", "Hello, ultraroasted...", "Oct 20", R.drawable.ic_email1),
            Email("System", "Verification Code", "Your email verification code is ...", "Oct 19", R.drawable.ic_email1)
        )

        recyclerView.adapter = EmailAdapter(emailList)
    }
}