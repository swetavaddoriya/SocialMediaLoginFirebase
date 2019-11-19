  implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'androidx.appcompat:appcompat:1.0.0-beta01'
    implementation 'com.google.android.material:material:1.0.0-beta01'

    api 'com.github.bumptech.glide:glide:4.8.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.8.0'
    api 'com.intuit.sdp:sdp-android:1.0.4'
    api 'com.victor:lib:1.0.4'
    api 'com.jakewharton:butterknife:10.1.0'
    annotationProcessor 'com.jakewharton:butterknife-compiler:10.1.0'
    api 'de.hdodenhof:circleimageview:2.2.0'

    api 'com.squareup.retrofit2:retrofit:2.3.0'
    api 'com.squareup.retrofit2:converter-gson:2.1.0'
    api 'androidx.cardview:cardview:1.0.0-beta01'
    api('com.wdullaer:materialdatetimepicker:3.6.0') {
        exclude group: 'com.android.support'
    }
    api 'org.greenrobot:eventbus:3.1.1'
    api 'com.google.firebase:firebase-messaging:20.0.0'
    api 'com.google.firebase:firebase-core:17.2.0'
    api 'com.makeramen:roundedimageview:2.3.0'
    api 'com.github.smarteist:autoimageslider:1.2.0'
    api 'com.github.bumptech.glide:glide:4.7.1'
    api 'com.github.lzyzsd:circleprogress:1.2.1'

    api ('cn.trinea.android.view.autoscrollviewpager:android-auto-scroll-view-pager:1.1.2') {
        exclude module: 'support-v4'
    }
    api project(':panningview')


    implementation 'com.google.firebase:firebase-analytics:17.2.0'
    implementation 'com.google.firebase:firebase-auth:19.0.0'
    implementation 'com.google.guava:guava:27.0.1-android'
    implementation 'com.facebook.android:facebook-login:4.42.0'
    implementation 'com.facebook.android:facebook-android-sdk:[5,6)'
    implementation 'com.google.android.gms:play-services-auth:17.0.0'
    implementation 'com.firebaseui:firebase-ui-auth:5.1.0'



    implementation 'com.squareup.okhttp:okhttp:2.3.0'
    api 'com.loopj.android:android-async-http:1.4.9'

    implementation 'org.jbundle.util.osgi.wrapped:org.jbundle.util.osgi.wrapped.org.apache.http.client:4.1.2'
    implementation 'com.squareup.picasso:picasso:2.5.2'
      
      =================
      
         classpath 'com.android.tools.build:gradle:3.3.2'
        classpath 'com.google.gms:google-services:4.2.0'
        classpath 'com.jakewharton:butterknife-gradle-plugin:10.1.0'
