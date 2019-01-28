package com.example.veselinazatsepina.toolbaranimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                when (p1) {
                    R.id.step2 -> {
                        p0?.transitionToState(R.id.step3)
                    }
                    R.id.step3 -> {
                        p0?.transitionToState(R.id.step4)
                    }
                    R.id.step4 -> {
                        p0?.transitionToState(R.id.step5)
                    }
                    R.id.step5 -> {
                        p0?.transitionToState(R.id.step6)
                    }
                    R.id.step6 -> {
                        p0?.transitionToState(R.id.step7)
                    }
                    R.id.step7 -> {
                        p0?.transitionToState(R.id.step8)
                    }
                    R.id.step8 -> {
                        p0?.transitionToState(R.id.step9)
                    }
                    R.id.step9 -> {
                        p0?.transitionToState(R.id.step10)
                    }
                    else -> {
                        p0?.transitionToState(R.id.start)
                    }
                }
            }
        })
    }
}
