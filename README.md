# OkCong

OKhttp3 Custom for android app

## Getting Started


### Step 1. Add it in your root build.gradle at the end of repositories:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.congfandi:OkCong:1.0.0'
	}
```
### Step 3. Call Class

```Java
 Kacong.build("https://google.com").get(this, new Response() {
            @Override
            public void response(String response, int statusCode) {
                Log.d("myresponse "+statusCode, "response: "+response);
            }
        });
```
## Custom response

```java

        Kacong.build("https://google.com").get(this, new Response() {
            @Override
            public void response(String response, int statusCode) {
                Log.d("myresponse "+statusCode, "response: "+response);
                switch (statusCode){
                    case SUCCESS://request succes  200
                        break;
                    case FAILED://request fail because params 401
                        break;
                    case ERROR://request error because server or connection 500
                        break;
                    case EMPTY_URL://request fail because url not found 404
                        break;
                }
            }
        });
```
