package br.com.agnes_bruno.recifecoffee.Cafeteria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.agnes_bruno.recifecoffee.R;

public class CafeteriaAdapter extends BaseAdapter {

    private final Context context;
    private  final List<Cafeteria> cafeterias;

    public CafeteriaAdapter(Context context, List<Cafeteria> cafeterias) {
        this.context = context;
        this.cafeterias = cafeterias;
    }

    @Override
    public int getCount() {
        //Isso é um If onde é verificado se a lista de cafeterias esta vazia, se não estiver retorna o tamanho da lista, se estiver retorna zero
        return cafeterias != null ? cafeterias.size(): 0;
    }

    @Override
    public Object getItem(int posicao) {
        return cafeterias.get(posicao); //Retorna o Item da lista na posição que foi passada por parametro
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //Infla a view
        View viewCafeteria = LayoutInflater.from(context).inflate(R.layout.adapter_cafeteria, parent, false);

        //Faz findViewById das views que precisa atualizar
        TextView title = (TextView) viewCafeteria.findViewById(R.id.title_cafeteria);
        TextView horario = (TextView) viewCafeteria.findViewById(R.id.horario_cafeteria);
        TextView localizacao = (TextView) viewCafeteria.findViewById(R.id.localizacao_cafeteria);
        ImageView logo = (ImageView) viewCafeteria.findViewById(R.id.logoCafeteria);

        //Atualiza os valores das views
        Cafeteria cafeteria = cafeterias.get(position);
        title.setText(cafeteria.getNome());
        horario.setText(cafeteria.getHorarios());
        localizacao.setText(cafeteria.getLocalizacao());
        logo.setImageResource(cafeteria.getImagem());

        //Retorna a view desta cafeteria
        return viewCafeteria;
    }
}
