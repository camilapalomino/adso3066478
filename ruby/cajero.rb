class Usuario
  attr_accessor :nombre, :pin, :saldo

  def initialize(nombre, pin, saldo)
    @nombre = nombre
    @pin = pin
    @saldo = saldo
  end
end

class Banco
  attr_accessor :usuarios

  def initialize
    @usuarios = []
  end

  def autenticar(nombre, pin)
    @usuarios.each do |usuario|
      if usuario.nombre == nombre
        if usuario.pin == pin
          puts "Estás logeado"
          return true
        else
          puts "Pin o nombre incorrecto"
          return false
        end
      end
    end
    puts "El usuario no existe"
    return false
  end
end

# Crear un banco y algunos usuarios
banco = Banco.new
banco.usuarios << Usuario.new("Juan", 1234, 1000.0)
banco.usuarios << Usuario.new("Maria", 5678, 2000.0)

# Autenticación de un usuario
banco.autenticar("Juan", 1234)  # Salida: Estás logeado
banco.autenticar("Maria", 1234)  # Salida: Pin o nombre incorrecto
banco.autenticar("Carlos", 1234)  # Salida: El usuario no existe
