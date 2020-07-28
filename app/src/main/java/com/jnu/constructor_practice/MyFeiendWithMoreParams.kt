package com.jnu.constructor_practice

import android.util.Log


// 추가 생성자로 되어 있는 친구 클래스
// 필수로 넣고싶지않고 넣고싶은건 넣고 넣고싶지않은건 넣고싶지 않을때 밑에와 같이 하면된다.
// () = 기본생성자를 허용한다. ( () 를 하지않으면 추가생성자를 만들 수 없다)
class MyFeiendWithMoreParams() {

    companion object{
        const val TAG: String = "로그"
    }

    // 맴버 변수
    var name : String? = null
    var age : Int? = null
    var isMarried: Boolean? = null
    var nickname : String? = null

    // 기본 생성자
    init {
        Log.d(TAG,"MyFeiendWithMoreParams - init() called")
        this.name = ""
    }
    // 외부에서 들어오는걸로 값을 설정한다.
    // 추가 생성
    // 추가생성자는 기본 생성자가 있어야함 

     constructor(name : String) : this() {
        Log.d(TAG,"MyFeiendWithMoreParams - name 생성자() called")
        this.name = name
    }
    constructor(name : String, age: Int) : this() {
        Log.d(TAG,"MyFeiendWithMoreParams - name ,age 생성자() called")
        this.name = name
        this.age = age
    }

}