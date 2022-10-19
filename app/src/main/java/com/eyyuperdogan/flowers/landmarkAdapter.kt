package com.eyyuperdogan.flowers
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eyyuperdogan.flowers.databinding.RecyclerRowBinding

class LandmarkAdapter(var landmarklist:ArrayList<landmark>) : RecyclerView.Adapter<LandmarkAdapter.landmarkHolder>() {
    class landmarkHolder(var binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): landmarkHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return landmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: landmarkHolder, position: Int) {
        holder.binding.textName.text=landmarklist.get(position).name
        holder.binding.textExplanation.text=landmarklist.get(position).expectation
        holder.binding.imageView2.setImageResource(landmarklist.get(position).image)

        holder.itemView.setOnClickListener(){
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarklist.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return landmarklist.size
    }
}