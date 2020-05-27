package br.com.facebookcopy.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.facebookcopy.entity.Usuarios;
import br.com.facebookcopy.repository.UsuariosRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UsuariosRepository usuariosRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuarios usuario = usuariosRepository.findByEmail(email);
		
		if(usuario != null)
			return new CustomUserDetails(usuario);
		
		throw new UsernameNotFoundException("Usuário não encontrado!");
	}
	
	class CustomUserDetails extends Usuarios implements UserDetails {
		
		private static final long serialVersionUID = -2294474115133353616L;

		public CustomUserDetails(Usuarios usuario) {
			super(usuario);
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return AuthorityUtils.createAuthorityList("ROLE_USER");
		}

		@Override
		public String getPassword() {
			return this.getSenha();
		}

		@Override
		public String getUsername() {
			return this.getEmail();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}		
	}
}
