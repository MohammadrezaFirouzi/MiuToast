# MiuToast


[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
 [![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
 


![MiuToast](https://uploadkon.ir/uploads/613308_24images.jpg)

**A material design Toast Library for Android**



## Screenshots


![Screenshot](https://uploadkon.ir/uploads/ec2008_24InShot-20240408-191655664.jpg)


## Prerequisites

Add it in your root build.gradle at the end of repositories:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            mavenCentral()
            maven { url 'https://jitpack.io' }
	}
}
```
<br/>

## Dependencies

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
    implementation 'com.github.MohammadrezaFirouzi:MiuToast:1.0.0'
}
```
<br/>


## Usage


To display an Info Toast:

``` java
       MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.INFO_TYPE,true, null).show();
```
To display a Warning Toast:

``` java
       MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.WARNING_TYPE,true, null).show();
```
To display an Error Toast:

``` java
       MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.ERROR_TYPE,true, null).show();
```
To display a Success Toast:

``` java
       MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.SUCCESS_TYPE,true, null).show();
```

<br/>


### If you want to use Custom Icons:

``` java
        MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.CUSTOM_IMAGE_TYPE,true, R.drawable.images).show();
```


