<h1>Cadastro de cliente</h1>
<form action="?controller=client&action=registerView" method="post">

    <div class="mb-3 mt-3">
        <label class="form-label" for="">Nome</label>
        <input class="form-control" type="text" name="name">
    </div>

    <div class="mb-3 mt-3">
        <label class="form-label" for="">Email</label>
        <input class="form-control" type="email" name="email">
    </div>

    <div class="form-group">
        <label for="phone">Telefone</label>
        <input type="text" class="form-control" name="phone">
    </div>

    <div class="form-group">
        <div class="radio">
            <label><input type="radio" name="gender" value="female" checked>Feminino</label>
        </div>
        <div class="radio">
        <label><input type="radio" name="gender" value="male" checked>Masculino</label>
        </div>
        <div class="radio">
            <label><input type="radio" name="gender" value="other" disabled>Outro</label>
        </div>
    </div>

    <div class="checkbox">
        <label>
            <input type="checkbox" name="accept"> Desejo receber os comunicados do site.
        </label>
    </div>

    <button class="btn btn-primary" type="submit">Enviar</button>


</form>