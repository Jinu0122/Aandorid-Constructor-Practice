package com.jnu.constructor_practice

import android.provider.ContactsContract
import android.util.Log

// 매게변수를 가지는 친구 클래스
// 해당 멤버들은 필수로 넣어줘야한다.
class MyFriendWithParams(var name: String?,
                         var age: Int?,
                         var isMAarried: Boolean?,
                         var nickname:String?) {

    companion object{
        const val TAG: String = "로그"
    }

    var address : String =""
    // 이니시 == 시작
    // 기본생성
    init {
        Log.d(TAG,"MyFriendWithParams - init() called")
        this.name = "할아범"
        this.age = 100
        this.isMAarried = true
        this.nickname = "어르신"

    }
    // 추가 생성
    // 추가된 부분을 제외하고 들어간부분은 반환해야한다.
    constructor(name: String?,
                age: Int?,
                isMAarried: Boolean?,
                nickname: String?,
                address: String): this(name, age, isMAarried, nickname){
        this.address = address
    }


}