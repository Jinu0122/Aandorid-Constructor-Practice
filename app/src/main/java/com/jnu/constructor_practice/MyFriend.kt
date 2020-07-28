package com.jnu.constructor_practice

import android.util.Log

// 클래스 이름 : 내 친구
class MyFriend {

    companion object{
        const val TAG: String = "로그"
    }
    
    // 멤버 변수
    // 이름
    var name: String? = null
    // 나이
    var age: Int? = null
    // 결혼 여부
    var isMarried: Boolean = false
    // 병명
    var nickname: String? = null

    // 기본 생성자
    // 메모리에 올릴때 값을 설정할 수 있다.
    init {
        Log.d(TAG, "MyFriend - init() called")

        name = "홍길동"
        age = 20
        isMarried = false
        nickname = "아버지를 아버지라 못부르는 사나이"
    }
}