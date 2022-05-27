package com.example.paypal;

import android.app.Application;

import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.Environment;
import com.paypal.checkout.config.SettingsConfig;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;
import com.paypal.checkout.paymentbutton.PayPalButton;

public class app extends Application {
    PayPalButton payPalButton;

    private static app mContext;



        CheckoutConfig checkoutConfig;

        private static final String CLIENT_ID = "AdH8PnF7Mzb3mYLBYP1lDpn8xmtwEPONK5w6OBurlfHrOCuA2lVyz77o5u5lk6YZ3htnpVDWiMJhCRjw";

        @Override
        public void onCreate() {
            super.onCreate();
            checkoutConfig = new CheckoutConfig(
                    this,
                    CLIENT_ID,
                    Environment.SANDBOX,
                    "com.example.paypal://paypalpay",
                    CurrencyCode.USD,
                    UserAction.PAY_NOW,
                    new SettingsConfig(
                            true,
                            false));

            PayPalCheckout.setConfig(checkoutConfig);

        }


    public static app getContext() {
        return mContext;
    }
}