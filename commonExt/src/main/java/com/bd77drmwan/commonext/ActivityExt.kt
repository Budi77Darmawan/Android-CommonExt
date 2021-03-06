package com.bd77drmwan.commonext

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

fun Activity.toast(message: String? = getString(R.string.default_message_toast)) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
fun Activity.toastLong(message: String? = getString(R.string.default_message_toast)) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

fun Activity.hideKeyboard(mView: View) {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    imm?.hideSoftInputFromWindow(mView.windowToken, 0)
}