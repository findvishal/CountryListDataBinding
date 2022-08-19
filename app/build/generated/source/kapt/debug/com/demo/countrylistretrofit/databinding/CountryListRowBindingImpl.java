package com.demo.countrylistretrofit.databinding;
import com.demo.countrylistretrofit.R;
import com.demo.countrylistretrofit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CountryListRowBindingImpl extends CountryListRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CountryListRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CountryListRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.flagImage.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCapital.setTag(null);
        this.tvName.setTag(null);
        this.tvRegion.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.countryModel == variableId) {
            setCountryModel((com.demo.countrylistretrofit.data.CountryModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCountryModel(@Nullable com.demo.countrylistretrofit.data.CountryModel CountryModel) {
        this.mCountryModel = CountryModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.countryModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.demo.countrylistretrofit.data.CountryModel countryModel = mCountryModel;
        java.lang.String countryModelFlagsPng = null;
        java.lang.String countryModelName = null;
        java.lang.String countryModelRegion = null;
        com.demo.countrylistretrofit.data.FlagsData countryModelFlags = null;
        java.lang.String countryModelCapital = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (countryModel != null) {
                    // read countryModel.name
                    countryModelName = countryModel.getName();
                    // read countryModel.region
                    countryModelRegion = countryModel.getRegion();
                    // read countryModel.flags
                    countryModelFlags = countryModel.getFlags();
                    // read countryModel.capital
                    countryModelCapital = countryModel.getCapital();
                }


                if (countryModelFlags != null) {
                    // read countryModel.flags.png
                    countryModelFlagsPng = countryModelFlags.getPng();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.demo.countrylistretrofit.adapter.CountryListAdapter.loadImage(this.flagImage, countryModelFlagsPng);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCapital, countryModelCapital);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, countryModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRegion, countryModelRegion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): countryModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}