package com.example.administrador.aplicacaoteste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Client> clienteNames = getClients();

        ListView listVireCliente = (ListView) findViewById(R.id.listViewCliente);
        ClientListAdapter clientAdapter = new ClientListAdapter(MainActivity.this, clienteNames);
        listVireCliente.setAdapter(clientAdapter);
    }

    private List<Client> getClients() {
        List<Client> clients = new ArrayList<Client>();
        Client lucas = new Client();
        lucas.setName("Lucas");
        lucas.setAge(23);
        clients.add(lucas);

        Client garca = new Client();
        garca.setName("Garca");
        garca.setAge(24);
        clients.add(garca);

        return clients;

    }


}