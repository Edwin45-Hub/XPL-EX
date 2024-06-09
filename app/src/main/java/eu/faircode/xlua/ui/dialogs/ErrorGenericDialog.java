package eu.faircode.xlua.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.Objects;

import eu.faircode.xlua.R;

public class ErrorGenericDialog  extends AppCompatDialogFragment {
    private String message;
    public ErrorGenericDialog setMessage(String message) { this.message = message; return this; }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = Objects.requireNonNull(getActivity()).getLayoutInflater();
        View view = inflater.inflate(R.layout.errorgeneric, null);

        TextView tvMsg = view.findViewById(R.id.tvErrorMessage);
        tvMsg.setText(message);
        builder.setView(view)
                .setTitle(getString(R.string.title_error_generic))
                .setPositiveButton(R.string.option_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { } });

        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) { super.onAttach(context); }
}