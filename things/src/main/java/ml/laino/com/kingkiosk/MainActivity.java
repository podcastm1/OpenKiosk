package ml.laino.com.kingkiosk;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Skeleton of an Android Things activity.
 * <p>
 * Android Things peripheral APIs are accessible through the class
 * PeripheralManagerService. For example, the snippet below will open a GPIO pin and
 * set it to HIGH:
 * <p>
 * <pre>{@code
 * PeripheralManagerService service = new PeripheralManagerService();
 * mLedGpio = service.openGpio("BCM6");
 * mLedGpio.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW);
 * mLedGpio.setValue(true);
 * }</pre>
 * <p>
 * For more complex peripherals, look for an existing user-space driver, or implement one if none
 * is available.
 *
 * @see <a href="https://github.com/androidthings/contrib-drivers#readme">https://github.com/androidthings/contrib-drivers#readme</a>
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgMemu1 = (ImageView) findViewById(R.id.img_menu1);
        ImageView imgMemu2 = (ImageView) findViewById(R.id.img_menu2);
        ImageView imgMemu3 = (ImageView) findViewById(R.id.img_menu3);
        ImageView imgMemu4 = (ImageView) findViewById(R.id.img_menu4);
        ImageView imgMemu5 = (ImageView) findViewById(R.id.img_menu5);
        ImageView imgMemu6 = (ImageView) findViewById(R.id.img_menu6);
        ImageView imgMemu7 = (ImageView) findViewById(R.id.img_menu7);

        Glide.with(this).load(R.drawable.wap).into(imgMemu1);
        Glide.with(this).load(R.drawable.wap).into(imgMemu2);
        Glide.with(this).load(R.drawable.wap).into(imgMemu3);
        Glide.with(this).load(R.drawable.wap).into(imgMemu4);
        Glide.with(this).load(R.drawable.wap).into(imgMemu5);
        Glide.with(this).load(R.drawable.wap).into(imgMemu6);
        Glide .with(this).load(R.drawable.wap).into(imgMemu7);

    }
}
