package com.example.traveljournal

import com.google.firebase.auth.FirebaseAuth

object FirebaseUtils {
    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    fun signInUser(email: String, password: String, callback: (Boolean) -> Unit) {
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    callback(true)  // Login successful
                } else {
                    callback(false)  // Login failed
                }
            }
    }

    fun getCurrentUser() = mAuth.currentUser
}
