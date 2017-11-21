package edelafa.transportec.Transportec.Activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.Transportec.Adapters.ListAdapter;
import edelafa.transportec.R;

public class MenuActivity extends Activity {

    public static void launch(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent(appCompatActivity, MenuActivity.class);
        appCompatActivity.startActivity(intent);
    }

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;

    @BindView(R.id.b_info)
    Button bInfo;

    //Se asignan los Padres de la ExpandableListView
    List<String> ParentList = new ArrayList<String>();
    {
        ParentList.add("Servicio");
        ParentList.add("Consultar");
    }

    //Se asignan los Hijos de la ExpandableListView
    String[] SolicitudName = {"Solicitar Taxi"};
    String[] InformaciónName = {"Tarifas", "Taxistas"};
    String[] ByDefaultMessage = {"Cargando"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        ParentListItems = new LinkedHashMap<String, List<String>>();

        for (String HoldItem : ParentList){
            if (HoldItem.equals("Servicio")){
                loadChild(SolicitudName);
            } else if (HoldItem.equals("Consultar")){
                loadChild(InformaciónName);
            } else
                loadChild (ByDefaultMessage);
            ParentListItems.put(HoldItem, ChildList);
        }

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        final ExpandableListAdapter expListAdapter = new ListAdapter(this, ParentList, ParentListItems);
        expandableListView.setAdapter(expListAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                final String selected = (String) expListAdapter.getChild(groupPosition, childPosition);
                Intent intent;

                switch (selected){
                    case "Solicitar Local": intent =
                            new Intent(MenuActivity.this, ServiceActivity.class);
                        startActivity(intent);
                        break;
                }

                switch (selected){
                    case "Tarifas": intent =
                            new Intent(MenuActivity.this, InfoTarifaActivity.class);
                        startActivity(intent);
                        break;
                }

                switch (selected){
                    case "Taxistas": intent =

                            new Intent(MenuActivity.this, InfoTaxistaActivity.class);
                        startActivity(intent);
                        break;
                }

                return true;
            }
        });

        bInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog alert = new AlertDialog.Builder(MenuActivity.this, R.style.AlertDialogCustom).create();
                alert.setTitle("Estamos para brindarle el mejor servicio");
                alert.setMessage("En el menu Solicitar, podra gestionar un servicio, ya sea dentro de la region de Huatusco" +
                        "o un servicio para salir de la ciudad, así como agendar un servicio en el lugar y hora que usted lo necesite.\n"+
                        "\nEn el menu Consultar, usted podrá informarse acerca de nuestras Tarifas y comprobar los taxistas que " +
                        "estan registrados en nuestra empresa");
                alert.setButton("Ok", new DialogInterface.OnClickListener(){

                    public void onClick (DialogInterface dialog, int which){
                    }
                });
                alert.show();
            }
        });

    }

    private void loadChild(String[] ParentElementsName) {
        ChildList = new ArrayList<String>();
        for (String model: ParentElementsName)
            ChildList.add(model);
        }

}
