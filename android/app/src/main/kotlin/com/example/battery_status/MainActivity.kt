/*package com.example.battery_status
import android.content.Context
import android.content.ContextWrapper
import android.os.BatteryManager
import android.os.Build
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import android.content.Intent
import android.content.IntentFilter

class MainActivity: FlutterActivity() {

    private val CHANNEL = "samples.flutter.dev/battery"

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
            call, result ->
            if(call.method == "get battery level") {
                val batteryLevel = getBatteryLevel()

                if(batteryLevel != -1) {
                    result.success(batteryLevel)
                } else {
                  result.error("UNAVALABLE", "Battery level not available", null)
                }

            }
            else {
                result.notImplemented()
            }

        }
    }

    private fun getBatteryLevel() : Int {
        val batteryLevel : Int
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val batteryManager = getSystemService(Context.BATTERY_SERVICE) as BatteryManager
            batteryLevel = intent!!.getIntExtra(BatteryManager.BATTERY_PROPERTY_CAPACITY.toString())

        } else {
            val intent = ContextWrapper(applicationContext).registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
            batteryLevel = intent!!.getIntExtra(BatteryManager.EXTRA_LEVEL)-1 * 100 /intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
        }

        return batteryLevel;

    }

}

private fun Intent.getIntExtra(toString: String): Int {
   return 0;
} */

package com.example.battery_status
// android code
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
}
