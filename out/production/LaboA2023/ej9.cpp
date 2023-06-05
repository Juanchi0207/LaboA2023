#include <iostream>
#include <vector>

using namespace std;

vector<int> indicesRepetidos(vector<int>v1,vector<int>v2,vector<int>v3){
    vector<int>posiciones;
    int i=0;
    int j=0;
    int k=0;
    while(i<v1.size() && j<v2.size() && k<v3.size()){
        if(v1[i]==v2[j]){

        }
    }
    return posiciones;
}

int main(){
    vector<int>v1={1,3,4};
    vector<int>v2={3,5,7};
    vector<int>v3={1,2,3};
    vector<int>indices=indicesRepetidos(v1,v2,v3);
}