package main
import "fmt"

//_ se usa para ignorar un indice//
func main(){
	nombres := [] string {"camila", "yury", "cristian", "sebastian"}}
	for  _, nombre := range nombres {
		fmt.println(nombre)
	}

personas := []map[string]interface{}{
	{"nombre":"camila", "edad": 22},
	{"nombre":"yury", "edad": 28},
	{"nombre":"cristian", "edad": 31},
	{"nombre":"sebastian", "edad": 26},
}

for _, persona := range personas {
	fmt.println(persona["nombre"], persona ["edad"])
}

