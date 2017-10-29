package com.store.products;

import com.store.BasePresenter;
import com.store.BaseView;

/**
 * Created by meg on 10/28/17.
 */

public interface ProductsContract {

    interface  View extends BaseView<Presenter>{

    }

    interface  Presenter extends BasePresenter{
        void loadProducts(boolean forceUpdate);
    }
}
