package com.store.products;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.store.R;
import com.store.util.ActivityUtils;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_act);

        ProductsFragment productsFragment =
                (ProductsFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        if(productsFragment == null){
            // Create the fragment
            productsFragment = ProductsFragment.newInstance("Products", "Products");
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(),
                    productsFragment,
                    R.id.contentFrame
            );
        }

        // Load previously saved state, if available.
        if(savedInstanceState != null){

        }
    }
}
