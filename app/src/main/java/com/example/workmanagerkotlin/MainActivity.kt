package com.example.workmanagerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.lifecycle.Observer
import androidx.work.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data=androidx.work.Data.Builder().putInt("getNumber",1).build()

        val constraints=Constraints.Builder()
            //.setRequiredNetworkType(NetworkType.NOT_ROAMING)
            .setRequiresBatteryNotLow(false).build()
        /*
        val myRequest: OneTimeWorkRequest= OneTimeWorkRequestBuilder<WorkKotlin>()
            .setInputData(data)
            .setConstraints(constraints)
            .build()
        WorkManager.getInstance(this).enqueue(myRequest)

        val myPeriodikRequest:PeriodicWorkRequest= PeriodicWorkRequestBuilder<WorkKotlin>(15,TimeUnit.MINUTES)
            .setInputData(data).setConstraints(constraints).build()

        WorkManager.getInstance(this).enqueue(myPeriodikRequest)

        WorkManager.getInstance(this).getWorkInfoByIdLiveData(myPeriodikRequest.id)
            .observe(this, Observer {
                if(it.state==WorkInfo.State.RUNNING){
                    println("running")
                }
                else if(it.state==WorkInfo.State.FAILED){
                    println("failed")
                }
                else if (it.state==WorkInfo.State.SUCCEEDED){
                    println("succeeded")
                }
            })*/
        //WorkManager.getInstance(this).cancelWorkById(myPeriodikRequest.id)
        /*
        val myOneTimeWorkRequest:OneTimeWorkRequest= OneTimeWorkRequestBuilder<WorkKotlin>()
            .setConstraints(constraints)
            .setInputData(data).build()

        WorkManager.getInstance(this).beginWith(myOneTimeWorkRequest).then(myOneTimeWorkRequest)
            .then(myOneTimeWorkRequest).enqueue()*/

    }
}