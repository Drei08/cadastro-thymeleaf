package br.com.dobackaofront.cadastro.controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.dobackaofront.cadastro.entity.Usuario;

public class UsuarioController {
	
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	@GetMapping()
	public String inicial(Model model) {
		return "home";
	} 

	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "cadastrar";
	}
	
	
	@PostMapping("/cadastrar")
	public String cadastrar(@ModelAttribute Usuario usuario){
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getCpf());
		System.out.println(usuario.getSexo());
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
		System.out.println(usuario.getCargo());
		System.out.println(usuario.getHabilidades());
		
		boolean status = false;
		
		for(int i = 0; i<usuarios.size(); i++) {
			Usuario usuarioAux = usuarios.get(i);
			
			if(usuarioAux.getCpf().equals(usuario.getCpf())) {
				usuario.setId(i);
				usuarios.set(i, usuario);
				i = usuarios.size();
				status = true;
			}
		}
			
		if(status == false) {
			usuario.setId(usuarios.size());
			usuarios.add(usuario);
			return "cadastrar";
		}
		
		else {
			return "home"; 
		}
	}
}
