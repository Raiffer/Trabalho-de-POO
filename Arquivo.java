class Usuario{
    private String nome, dataNascimento, email, senha;
    private int telefone, cpf, cep;
    
    public String getnome(){
        return this.nome;
    }
    
    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;   
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
}

class Organizador{
    private int idOrganizador, orsamento, gastos, telefone, cpf, cep;
    private String nome, dataNascimento,email, senha;
    
    public int getidOrganizador(){
        return this.idOrganizador;
    }
    
    public int getorsamento(){
        return this.orsamento;
    }
    
    public int getgastos(){
        return this.gastos;
    }
    
    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }
    
    public void setidOrganizador(int idOrganizador){
        this.idOrganizador = idOrganizador;
    } 
    
    public void setorsamento(int orsamento){
        this.orsamento = orsamento;
    }
    
    public void setgastos(int gastos){
        this.gastos = gastos;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
    public void cadastrarEvento(){
        
    }
    
    public void cancelarEvento(){
        
    }
}    

class Participante{
    
    private int idParticipante, telefone, cpf, cep;
    private String nome, dataNascimento, email, senha;
    public double notaEvento;
    
    public int getidParticipante(){
        return this.idParticipante;
    }

    public double getnotaEvento(){
        return this.notaEvento;
    }

    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }

    public void setidParticipante(int idParticipante){
        this.idParticipante = idParticipante;
    } 
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
    public void setnotaEvento(double notaEvento){
        this.notaEvento = notaEvento;
    }
    
    
}

class Palestrante{
    private int idPalestrante, telefone, cpf, cep;
    private String nome, dataNascimento, email, senha;
    
    public int getidPalestrante(){
        return this.idPalestrante;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public int gettelefone(){
        return this.telefone;
    }
    
    public int getcpf(){
        return this.cpf;
    }
    
    public int getcep(){
        return this.cep;   
    }
    
    public String getdataNascimento(){
        return this.dataNascimento;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public String getsenha(){
        return this.senha;
    }
    
    public void setidPalestrante(int idPalestrante){
        this.idPalestrante = idPalestrante;
    } 
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setcep(int cep){
        this.cep = cep;
    }
    
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setsenha(String senha){
        this.senha = senha;
    }
    
    
}

class Evento{
    String data, nome, hora;
    int limiteParticipantes, valor;
    
    public String getdata(){
        return this.data;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public String gethora(){
        return this.hora;
    }
    
    public int getlimiteParticipantes(){
        return this.limiteParticipantes;
    }
    
    public int getvalor(){
        return this.valor;
    }
    
    public void setdata(String data){
        this.data = data;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void sethora(String hora){
        this.hora = hora;
    }
    
    public void setlimiteParticipantes(int limiteParticipantes){
        this.limiteParticipantes = limiteParticipantes;
    }
    
    public void setvalor(int valor){
        this.valor = valor;
    }
    
    public void criarAtividade(){
        
    }
    
    public void removerAtividade(){
        
    }
    
    public void enviarEmail(){
        
    }
}

class Atividade{
    String nome, horario, data, local, descricao;
    int idEvento;

    public String gethorario(){
        return this.horario;
    }

    public String getnome(){
        return this.nome;
    }

    public String getdata(){
        return this.data;
    }

    public String getlocal(){
        return this.local;
    }

    public String getdescricao(){
        return this.descricao;
    }

    public int getidEvento(){
        return this.idEvento;
    }

    public void sethorario(String horario){
        this.horario = horario;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public void setdata(String data){
        this.data = data;
    }

    public void setlocal(String local){
        this.local = local;
    }

    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    public void setidEvento(int idEvento){
        this.idEvento = idEvento;
    }
}
