package com.example.mvvnarchitecture.data

import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.example.Sally_Beauty_Shop.navigation.ROUTE_VIEW_PRODUCT
import com.example.mvvnarchitecture.models.Delivery
import com.example.mvvnarchitecture.models.Products
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

//import com.google.firebase.storage.FirebaseStorage

class ProductViewModel(var navController: NavHostController, var context: Context) {
    fun saveFruit(
        fruitName:String,
        fruitPrice:String,
        filePath: Uri
    ){
        var id = System.currentTimeMillis().toString()
        var storageReference = FirebaseStorage.getInstance().getReference().child("Fruits/$id")
//        progress.show()

        storageReference.putFile(filePath).addOnCompleteListener{
//            progress.dismiss()
            if (it.isSuccessful){
                // Proceed to store other data into the db
                storageReference.downloadUrl.addOnSuccessListener {
                    var fruitImageUrl = it.toString()
                    var houseData = Products(
                        fruitName,
                        fruitPrice,
                        fruitImageUrl,
                        id
                    )
                    var dbRef = FirebaseDatabase.getInstance().getReference().child("Fruits/$id")
                    dbRef.setValue(houseData)
                    Toast.makeText(context, "Upload successful", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_VIEW_PRODUCT)
                }
            }else{
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun viewProduct(
        fruit: MutableState<Products>,
        fruits: SnapshotStateList<Products>
    ): SnapshotStateList<Products> {
        val ref = FirebaseDatabase.getInstance().getReference().child("Fruits")

        //progress.show()
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                //progress.dismiss()
                fruits.clear()
                for (snap in snapshot.children) {
                    val value = snap.getValue(Products::class.java)
                    fruit.value = value!!
                    fruits.add(value)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })
        return fruits
    }

    fun makeDelivery(userid: String, location: String) {
        var deliveryId = System.currentTimeMillis().toString()
        var deliveryData = Delivery(userid, location, deliveryId,)
        var deliveryRef = FirebaseDatabase.getInstance().getReference().child("Delivery/$deliveryId")
//        progress.show()
        deliveryRef.setValue(deliveryData).addOnCompleteListener {
//            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Delivery in a few minutes", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

}