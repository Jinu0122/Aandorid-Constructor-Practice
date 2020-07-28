package com.jnu.constructor_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG: String = "로그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"MainActivity - onCreate() called")


        var myFriend = MyFriend()



        // 우리가 클래스안에서 멤버 변수에 private 를 붙이지 않았기 때문에 접근 가능하다.
        Log.d(TAG,"MainActivity - onCreate() called - myFriend.name : ${myFriend.name}")
        Log.d(TAG,"MainActivity - onCreate() called - myFriend.age : ${myFriend.age}")
        Log.d(TAG,"MainActivity - onCreate() called - myFriend.isMarried : ${myFriend.isMarried}")
        Log.d(TAG,"MainActivity - onCreate() called - myFriend.nickname : ${myFriend.nickname}")

        // 매개변수가 들어가는 생성자
        var myFriendChulsoo = MyFriendWithParams(name = "철수",
                                                age = 17,
                                                isMAarried = false,
                                                nickname = "안철수")
        Log.d(TAG,"MainActivity - MyFriendWithParams : ${myFriendChulsoo.name}")
        Log.d(TAG,"MainActivity - MyFriendWithParams : ${myFriendChulsoo.age}")
        Log.d(TAG,"MainActivity - MyFriendWithParams : ${myFriendChulsoo.isMAarried}")
        Log.d(TAG,"MainActivity - MyFriendWithParams : ${myFriendChulsoo.nickname}")

        // 매개변수가 들어가는 생성자
        var myFriendYoungsoo = MyFriendWithParams(name = "영수",
            age = 20,
            isMAarried = false,
            nickname = "국영수",
            address = "대한민국"
            // 추가적으로 생성자를 만들면 해당값을 넣어도 되고 안넣어도 된다.
            )
        var myFriendSoosan = MyFriendWithParams(name = "영수",
            age = 20,
            isMAarried = false,
            nickname = "hoho",
            address =  "대한민국"
            // 추가적으로 생성자를 만들면 해당값을 넣어도 되고 안넣어도 된다.
            // 원래 만들었던 생성자에 값을넣지않으면 오류가뜨게된다.

        )

        // 추가 생성자로 되어있는 친구 객체
        var myFriendJames = MyFeiendWithMoreParams(name = "제임스", age = 50)

        Log.d(TAG,"MainActivity - myFeiendJames.name : ${myFriendJames.name}")
        Log.d(TAG,"MainActivity - myFeiendJames.name : ${myFriendJames.age}")



    }
}