#include <iostream>
#include <vector>

using namespace std;

int mesetaMasLarga(vector<int> &v){
    int i = 0;
    int maxMeseta = 0; 
    int meseta=1;
    while(i < v.size()){
        if(v[i]==v[i+1]){
            meseta++;
        }
        else{
            if(meseta > maxMeseta){
                maxMeseta=meseta;
            }
            meseta=1;
        }
        i++;
    }
    return maxMeseta;
}

int main(){
    vector<int>v = {5,5,5,5,5,5,5,12314,5,6,7,7,7,7,7,7};
    cout<<mesetaMasLarga(v)<<endl;
}