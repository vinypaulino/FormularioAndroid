package br.com.vinypaulino.mobile.formularioandroid.mask;

import android.util.Log;
import android.widget.EditText;

import com.redmadrobot.inputmask.MaskedTextChangedListener;

import org.jetbrains.annotations.NotNull;

import br.com.vinypaulino.mobile.formularioandroid.activity.MainActivity;

/**
 * Classe para criar as mascaras usadas em toda aplicação
 * VinyPaulino
 */

public class InputMask {


    public static MaskedTextChangedListener getDateMask(EditText e) {
        return new MaskedTextChangedListener("[90]{/}[0000]", true, e, null,
                new MaskedTextChangedListener.ValueListener() {
                    @Override
                    public void onTextChanged(boolean filled, @NotNull String value) {
                        Log.d(MainActivity.class.getSimpleName(), String.valueOf(filled));
                        Log.d(MainActivity.class.getSimpleName(), value);
                    }
                });

    }

    public static MaskedTextChangedListener getCreditCardNumberMask(EditText e) {
        return new MaskedTextChangedListener("[0000] [0000] [0000] [0000]", true, e, null,
                new MaskedTextChangedListener.ValueListener() {
                    @Override
                    public void onTextChanged(boolean filled, @NotNull String value) {
                        Log.d(MainActivity.class.getSimpleName(), String.valueOf(filled));
                        Log.d(MainActivity.class.getSimpleName(), value);
                    }
                });

    }

    public static MaskedTextChangedListener getPhoneMask(EditText e) {
        return new MaskedTextChangedListener("+[00] [00] [90000] [0000]", true, e, null,
                new MaskedTextChangedListener.ValueListener() {
                    @Override
                    public void onTextChanged(boolean filled, @NotNull String value) {
                        Log.d(MainActivity.class.getSimpleName(), String.valueOf(filled));
                        Log.d(MainActivity.class.getSimpleName(), value);
                    }
                });

    }

}
