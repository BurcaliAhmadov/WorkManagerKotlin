package com.example.workmanagerkotlin

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.work.Worker
import androidx.work.WorkerParameters

class WorkKotlin( val context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): Result {
        val getdata=inputData
        val myNumber=getdata.getInt("getNumber",0)
        refresDatabase(myNumber)
        return Result.success()
    }
    fun refresDatabase(mynumber:Int ){
        var sharedPreferences:SharedPreferences=context.getSharedPreferences("com.example.workmanagerkotlin",MODE_PRIVATE)
        var mySavedNumber =sharedPreferences.getInt("myInt",0)
        mySavedNumber=mySavedNumber+mynumber
        println(mySavedNumber)
        sharedPreferences.edit().putInt("myInt",mySavedNumber).apply()
    }
}