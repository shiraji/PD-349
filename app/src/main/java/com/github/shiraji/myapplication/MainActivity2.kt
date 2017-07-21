package com.github.shiraji.myapplication

import android.Manifest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import permissions.dispatcher.NeedsPermission
import permissions.dispatcher.OnShowRationale
import permissions.dispatcher.PermissionRequest
import permissions.dispatcher.RuntimePermissions

@RuntimePermissions(kotlin = true)
class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @NeedsPermission(Manifest.permission.CAMERA)
    fun foo() {

    }

    @OnShowRationale(Manifest.permission.CAMERA)
    fun foo2(request: PermissionRequest) {

    }
}
